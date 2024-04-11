package com.example.loginsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hello";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Secured hello";
    }
    @GetMapping("/user")
    public String user(){return "User Role access";}
}
