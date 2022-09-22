package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Spring";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
