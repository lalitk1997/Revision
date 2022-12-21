package com.security.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> testFunc(){
        String str = "Welcome to Spring Security";
        return new ResponseEntity<>(str, HttpStatus.OK);
    }
}
