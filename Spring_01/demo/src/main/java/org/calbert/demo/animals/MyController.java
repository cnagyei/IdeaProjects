package org.calbert.demo.animals;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MyController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
