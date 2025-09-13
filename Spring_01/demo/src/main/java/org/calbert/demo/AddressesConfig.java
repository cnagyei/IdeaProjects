package org.calbert.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // Declare a class that produces beans
public class AddressesConfig {

    @Bean("mallam")
    public String address1() {
        return "4 Mallam, CP, Gbawe";
    }

    @Bean("wonoo")
    public String address2() {
        return "A 109, Sakora-Wonoo";
    }
}
