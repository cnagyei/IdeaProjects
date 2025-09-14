package org.calbert.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NameConfig {

    @Bean
    public String getManName() {
        return "Caleb Nana Agyei";
    }

    @Bean
    @Primary
    public String getWomanName() {
        return "Bertha Mongyamose Agyei";
    }
}
