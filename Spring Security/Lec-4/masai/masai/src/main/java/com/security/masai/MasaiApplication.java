package com.security.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasaiApplication {
	/*
	Adding Just Spring Security Dependency
	-> Checking how it affects the application.
	-> Basic authentication provided by default :
	-> user as Username and Password is generated in the terminal.
	 */
	public static void main(String[] args) {
		SpringApplication.run(MasaiApplication.class, args);
	}

}
