package com.wipro.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/v1/jenkin")
@RestController
public class JenkinController {
	@GetMapping
	public String welcome() {
		return "Welcome to Jenkin Pipeline";
	}
}
