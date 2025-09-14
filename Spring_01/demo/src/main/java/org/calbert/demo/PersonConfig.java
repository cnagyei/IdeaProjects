package org.calbert.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    Person personNicol() {
        return new Person("Nicol", "Agyei");
    }
}
