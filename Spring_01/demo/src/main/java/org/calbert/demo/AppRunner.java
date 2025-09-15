package org.calbert.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class AppRunner implements CommandLineRunner {
    private final AtomicInteger counter1;
    private final AtomicInteger counter2;

    public AppRunner(@Autowired AtomicInteger counter1, @Autowired AtomicInteger counter2) {
        this.counter1 = counter1;
        this.counter2 = counter2;
    }

    @Override
    public void run(String... args) throws Exception {
        counter1.addAndGet(2); // This will update the same bean for counter1 and counter2 if "singleton"; different beans if "prototype"
        counter2.addAndGet(3); // This will update the same bean for counter1 and counter2 if "singleton"; different beans if "prototype"
        counter1.addAndGet(5); // This will update the same bean for counter1 and counter2 if "singleton"; different beans if "prototype"

        System.out.println("Counter 1: " + counter1.get());
        System.out.println("Counter 2: " + counter2.get());
    }
}
