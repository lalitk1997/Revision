package com.security.masai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome Spring</h1>");
    }
}
