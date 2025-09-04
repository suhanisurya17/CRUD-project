package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // maps to /api/users because of your context path
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "Hello, users!";
    }
}
