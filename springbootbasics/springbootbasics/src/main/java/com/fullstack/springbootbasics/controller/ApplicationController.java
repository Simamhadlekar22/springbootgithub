package com.fullstack.springbootbasics.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("welcome to full stack developer");
    }
    @GetMapping("/services")
    public ResponseEntity<String> services() {

        return ResponseEntity.ok("Software Development");
    }
    @GetMapping("/address")
    public ResponseEntity<String> sayaddress() {

        return ResponseEntity.ok("Inspira mall,india");
    }
}

