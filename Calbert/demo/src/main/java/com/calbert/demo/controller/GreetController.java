package com.calbert.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// DispatcherServlet handles all these

@Controller
public class GreetController {

    @GetMapping(value="/greet", produces = MediaType.TEXT_HTML_VALUE) // Navigate to /greet and access the greetUser()
    /*
    @ResponseBody - Indicates greetUser() return value should be bound to a web response body and converted to
    HTTP response based on the TEXT_HTML_VALUE content type
     */
    @ResponseBody
    public String greetUser() {
        return "<html><p>Hello and welcome!</p></html>";
    }

    @GetMapping(value="/mySelf", produces=MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String mySelf() {
        return "<html><p>My Name is Caleb Nana Agyei!</p></html>";
    }

}
