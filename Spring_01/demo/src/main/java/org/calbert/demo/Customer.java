package org.calbert.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Customer {
    public final String name;
    public final String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "name='" + name + '\'' +
                ", adddress='" + address + '\'' +
                "}";
    }
}
