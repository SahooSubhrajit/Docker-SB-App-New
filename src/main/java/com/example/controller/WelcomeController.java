package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping(value = "/welcome/{name}")
	public String getMessage(@PathVariable String name) {
		return "Hi " + name + " Welcome to Java World!!!";
	}

}
