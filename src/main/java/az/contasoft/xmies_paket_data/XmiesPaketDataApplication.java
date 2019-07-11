package az.contasoft.xmies_paket_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("az.contasoft.xmies_paket_data.proxy")
@SpringBootApplication
public class XmiesPaketDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmiesPaketDataApplication.class, args);
    }

}
