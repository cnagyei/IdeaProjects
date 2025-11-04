package com.oath.africa.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
