package com.duttech.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}
	@RequestMapping("/")
	
	public String hello() {
		return "Hello World!";
	}
	
	
	@RequestMapping("/random")
	
	public String rendom() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
	
	
}
