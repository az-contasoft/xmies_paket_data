package az.contasoft.xmies_paket_data.proxy;

import az.contasoft.xmies_personal.db.entities.Personal;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "xmies_personal")
public interface PersonalProxy {

    @GetMapping("/xmies_personal/searchServices/getPersonal/{idPersonal}")
    ResponseEntity<Personal> getPersonal(@PathVariable("idPersonal") long idPersonal);
}
