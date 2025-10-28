package com.calbert.demo.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class AddressController {
    private ConcurrentHashMap<String, String> addressBook = new ConcurrentHashMap<>();

    @PostMapping("/addresses")
    public void postAddress(@RequestParam String name, @RequestParam String address) {
        addressBook.put(name, address);
    }

    @GetMapping("/addresses/{name}")
    public String getAddress(@PathVariable String name) {
        return addressBook.get(name);
    }

    @DeleteMapping("/deleteAddress")
    public void deleteAddress(@RequestParam String name) {
        addressBook.remove(name);
    }

    @GetMapping("/addresses")
    public ConcurrentHashMap<String, String> getAddresses() {
        return addressBook;
    }
}
