package io.javabrains.springsecurityjpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public ResponseEntity<String> testFunc(){
        String str = "Welcome to Spring";
        return new ResponseEntity<>(str, HttpStatus.OK);
    }
    @GetMapping("/user/url")
    public ResponseEntity<String> home(){
        String message = "Welcome home : user!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @GetMapping("/admin/url")
    public ResponseEntity<String> admin(){
        String message = "Welcome to admin dashboard.";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}