package com.example.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ServerController {

    @GetMapping("/api/server")
    public String getServerResponse() {
        return "Hello from Server!";
    }
}
