package com.example.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/check")
	public String home() {
		return "RITESH WELCOME";
	}
}
