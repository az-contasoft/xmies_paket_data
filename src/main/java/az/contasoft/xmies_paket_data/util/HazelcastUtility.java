package az.contasoft.xmies_paket_data.util;

import az.contasoft.xmies_paket.db.entity.Paket;
import az.contasoft.xmies_paket_data.api.searchServices.internal.PaketData;
import az.contasoft.xmies_paket_data.proxy.PaketProxy;
import az.contasoft.xmies_paket_data.proxy.PersonalProxy;
import az.contasoft.xmies_personal.db.entities.Personal;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class HazelcastUtility {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public HazelcastUtility(PaketProxy paketProxy, IMap<Long, Paket> mapOfPaket, PersonalProxy personalProxy, IMap<Long, Personal> mapOfPersonal) {
        this.paketProxy = paketProxy;
        this.mapOfPaket = mapOfPaket;
        this.personalProxy = personalProxy;
        this.mapOfPersonal = mapOfPersonal;
    }

    private final PaketProxy paketProxy;
    private final IMap<Long, Paket> mapOfPaket;

    private final PersonalProxy personalProxy;
    private final IMap<Long, Personal> mapOfPersonal;

    public Personal getPersonal(Long idPersonal) {
        try {
            logger.info("Hazelcastdan Personali almaga chalishiriq  : ");
            Personal personal = mapOfPersonal.get(idPersonal);
            if (personal == null) {
                logger.info("Hazelcast da Paket yoxdu proxy ile almaga chalishiriq");
                ResponseEntity<Personal> responseEntity = personalProxy.getPersonal(idPersonal);
                if (responseEntity.getStatusCodeValue() == 200) {
                    personal = responseEntity.getBody();
                }
            }
            return personal;
        } catch (Exception e) {
            logger.error("Error getting Personal from  or getting data from Personal Proxy : "+e,e);
            return null;
        }
    }



    public IMap<Long, Paket> getPaket()  {
        try {
            logger.info("Hazelcastdan Paketi almaga chalishiriq  : ");
        IMap<Long, Paket> paketMap = mapOfPaket;
        if (paketMap == null || paketMap.isEmpty()) {
            logger.info("Hazelcast da Paket yoxdu proxy ile almaga chalishiriq");
            ResponseEntity<IMap<Long, Paket>> responseEntity = paketProxy.getAllPaket();
            if (responseEntity.getStatusCodeValue() == 200) {
                paketMap = responseEntity.getBody();
            }
        }
        return paketMap;
    } catch (Exception e) {
            logger.error("Error getting paket from  or getting data from paket Proxy : "+e,e);
            return null;
        }
        }


        public List<PaketData> getPaketData(){
        try {
        IMap<Long, Paket> paketIMap = getPaket();
        List<PaketData> paketDataList = new ArrayList<>();
        for (Long idPaket : paketIMap.keySet()) {
            PaketData paketData = new PaketData();
            Paket paket = paketIMap.get(idPaket);
            if (paket != null) {
                paketData.setPaket(paket);
                if (paket.getIdPersonal() > 0) {
                    Personal personal = getPersonal(paket.getIdPersonal());
                    paketData.setPersonal(personal);
                }
            }
            paketDataList.add(paketData);
        }
        return paketDataList;
    } catch (Exception e) {
            logger.error("Error getting all Paket  data "+e,e);
            return null;
        }
        }
    }




