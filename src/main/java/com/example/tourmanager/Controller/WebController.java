package com.example.tourmanager.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping(value = {"/", "/home"})
    public String homepage() {
        return "Home";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
