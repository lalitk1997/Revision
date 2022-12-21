package com.security.masai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome Spring</h1>");
    }

    @GetMapping("/users/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello! Welcome to Spring Security.");
    }

    @GetMapping("/admin/bye")
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("Good Bye! Have great learning.");
    }

}
