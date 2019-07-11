package az.contasoft.xmies_paket_data.api.searchServices.internalServices;

import az.contasoft.xmies_paket_data.api.searchServices.internal.PaketData;
import az.contasoft.xmies_paket_data.util.HazelcastUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final HazelcastUtility hazelcastUtility;

    public Service(HazelcastUtility hazelcastUtility) {
        this.hazelcastUtility = hazelcastUtility;
    }



    public ResponseEntity<PaketData> getPaketData(long idPaket){
        try {
            PaketData paketData = hazelcastUtility.getPaketData().stream().filter(xd -> xd.getPaket().getIdPaket() == idPaket).findAny().orElse(null);
            if (paketData == null) {
                logger.info("PaketData NOT_FOUND");
                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
            }
            logger.info("PaketData Found");
            return new ResponseEntity<>(paketData,HttpStatus.OK);
        }catch (Exception e){
            logger.error("\n→→→: error  e: {}, e: {}\n\n", e, e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<PaketData>> getAllPaketData() {
        try {
            List<PaketData> paketDataList = hazelcastUtility.getPaketData();
            if (paketDataList == null || paketDataList.isEmpty()) {
                logger.info("paketDataList isEmpty");
                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
            }
            logger.info("paketDataList size : {}", paketDataList.size());
            return new ResponseEntity<>(paketDataList, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("\n→→→: error  e: {}, e: {}\n\n", e, e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
