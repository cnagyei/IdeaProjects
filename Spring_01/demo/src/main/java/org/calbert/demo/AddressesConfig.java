package org.calbert.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressesConfig {

    @Bean("mallam")
    public String address() {
        return "4 Mallam, CP, Gbawe";
    }
}
