package org.calbert.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Print directly to the command line
public class Runner implements CommandLineRunner {
    private final PasswordGenerator passwordGenerator;

    @Autowired
    public Runner(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
        System.out.println("A short password: " + passwordGenerator.generate(5));
        System.out.println("A long password: " + passwordGenerator.generate(10));
    }
}
