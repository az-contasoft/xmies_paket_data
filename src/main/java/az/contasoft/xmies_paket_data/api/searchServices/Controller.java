package az.contasoft.xmies_paket_data.api.searchServices;

import az.contasoft.xmies_paket_data.api.searchServices.internal.PaketData;
import az.contasoft.xmies_paket_data.api.searchServices.internalServices.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/searchServices")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }


    @GetMapping("getPaketData/{idPaket}")
    public ResponseEntity<PaketData> getPaketData(@PathVariable("idPaket") long idPaket){
        logger.info("\n→→→SEARCH_CONTROLLER: getPaketData\n\n");
        return service.getPaketData(idPaket);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PaketData>> getPaketByIdPaket() {
        logger.info("\n→→→SEARCH_CONTROLLER: getPaketData\n\n");
        return service.getAllPaketData();
    }


}

