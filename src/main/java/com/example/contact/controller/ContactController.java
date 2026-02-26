package com.example.contact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Vineela —  Spring Boot App is Running!";
    }
}
