package org.calbert.demo;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Bean
    public Customer customer(@Autowired String address) {
        System.out.println(address);
        return new Customer("Caleb Agyei", address);
    }

    @Bean
    public Customer temporaryCustomer(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
    }
}
