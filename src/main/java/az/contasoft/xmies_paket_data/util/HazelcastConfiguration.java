package az.contasoft.xmies_paket_data.util;

import az.contasoft.xmies_paket.db.entity.Paket;
import az.contasoft.xmies_personal.db.entities.Personal;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HazelcastConfiguration {
    @Bean
    public Config config() {
        return new Config();
    }

    @Bean
    public HazelcastInstance instance(Config config) {
        return Hazelcast.newHazelcastInstance(config);
    }

    @Bean
    public IMap<Long, Personal> mapOfPersonal(HazelcastInstance instance){
        return instance.getMap("mapOfPersonal");
    }

    @Bean
    public IMap<Long, Paket> mapOfPaket(HazelcastInstance instance){
        return  instance.getMap("mapOfPaket");
    }
}
