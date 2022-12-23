package io.javabrains.springsecurityjpa.controller;

import io.javabrains.springsecurityjpa.entity.User;
import io.javabrains.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public ResponseEntity<String> testFunc2(){
        String str = "Welcome to Spring Security";
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
    @GetMapping("/admin/allUser")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userRepository.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}