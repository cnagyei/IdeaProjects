package org.calbert.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Print directly to the command line
public class Runner implements CommandLineRunner {
    private final PasswordGenerator generator;

    public Runner(PasswordGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
        System.out.println("A short password: " + generator.generate(5));
        System.out.println("A long password: " + generator.generate(10));
    }
}
