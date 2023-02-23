package com.jwt.amigoscode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {
    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Welcome is the greeting");
    }

    @GetMapping("/good-bye")
    public ResponseEntity<String> goodBye() {
        return ResponseEntity.ok("good bye and see you later");
    }
}
