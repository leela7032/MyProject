package com.java.CrudOperations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}
