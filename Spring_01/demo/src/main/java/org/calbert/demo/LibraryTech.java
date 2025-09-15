package org.calbert.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
class Config2 {

    @Bean(initMethod="init", destroyMethod = "destroy") // Alternate way of using @PostConstruct and @PreDestroy
    public TechLibrary techLibrary() {
        return new TechLibrary();
    }
}

@Component
class TechLibrary {
    private final List<String> bookTitles = Collections.synchronizedList(new ArrayList<String>());

    @PostConstruct
    public void init() {
        bookTitles.add("Java");
        bookTitles.add("Python");
        bookTitles.add("C#");
        bookTitles.add("C++");
        bookTitles.add("C");
        System.out.println("The library has been initialized: " + bookTitles);
    }

    @PreDestroy
    public void destroy() {
        bookTitles.clear();
        System.out.println("The library has been destroyed: " + bookTitles);
    }
}
