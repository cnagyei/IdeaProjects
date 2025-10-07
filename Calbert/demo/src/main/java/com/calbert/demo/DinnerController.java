package com.calbert.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DinnerController {

    @GetMapping(value = "/dinner", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public  String dinner() {
        return "<html><h1>It's time for dinner</h1></html>";
    }
}
