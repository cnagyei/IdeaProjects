package com.oath.africa.presentation;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CustomizingRestExample1 {
    @GetMapping(path = "/hello", produces = "text/plain")
    public void hello(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_OK);  // Status code
        response.setContentType("text/plain");          // Content type
        response.getWriter().write("Hello World");    // Response Body
    }
}
