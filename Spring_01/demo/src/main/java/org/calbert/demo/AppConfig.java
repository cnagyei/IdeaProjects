package org.calbert.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class AppConfig {

    @Bean
    // @Scope("prototype")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    // @Scope("singleton")
    // @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) - Equivalent to previous line
    public AtomicInteger createCounter() {
        return new AtomicInteger();
    }
}
