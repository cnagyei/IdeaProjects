package org.calbert.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("org.calbert.demo")
@Configuration
public class Config {

    @Bean
    Person personNicol() {
        return new Person("Nicol", "Agyei");
    }
}
