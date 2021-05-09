package com.ankur.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		System.out.println("Welcome to Jenkins...");
		return "Welcome to the Sample Hello World Program...";
	}

}
