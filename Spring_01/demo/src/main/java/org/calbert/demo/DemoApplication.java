package org.calbert.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

        System.out.println(("=================="));

        /*
        // Application Context
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        System.out.println(context.getBean(Person.class));

        System.out.println(("=================="));

        var contextPassword = new AnnotationConfigApplicationContext(PasswordConfig.class);
        System.out.println(Arrays.toString(contextPassword.getBeanDefinitionNames()));
        System.out.println(contextPassword.getBean(PasswordAlphabet.class));

        System.out.println(("=================="));

        var contextName = new AnnotationConfigApplicationContext(NameConfig.class);
        System.out.println(Arrays.toString(contextName.getBeanDefinitionNames()));
        System.out.println(contextName.getBean(String.class));

        System.out.println(("=================="));

        ConfigurableApplicationContext springRunContext = SpringApplication.run(DemoApplication.class, args);
        System.out.println(Arrays.toString(springRunContext.getBeanDefinitionNames()));
         */
	}

    @Bean
    public Customer customer(@Qualifier("getWomanName") String name,
                             @Qualifier("mallam") String address) {
        System.out.println(name);
        System.out.println(address);
        return new Customer(name, address);
    }

    @Bean
    public Customer temporaryCustomer(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
    }
}
