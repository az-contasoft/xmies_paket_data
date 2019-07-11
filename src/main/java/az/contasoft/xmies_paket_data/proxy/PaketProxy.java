package az.contasoft.xmies_paket_data.proxy;


import az.contasoft.xmies_paket.db.entity.Paket;
import com.hazelcast.core.IMap;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


    @FeignClient(name = "netflix-zuul-api-gateway-server")
    @RibbonClient(name = "xmies_paket")
    public interface PaketProxy {

        @GetMapping("/xmies_paket/searchServices/getAll")
        ResponseEntity<IMap<Long, Paket>> getAllPaket();
    }


