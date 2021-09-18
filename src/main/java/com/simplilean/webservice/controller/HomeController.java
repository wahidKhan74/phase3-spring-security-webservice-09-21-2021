package com.simplilean.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/index")
	public String indexMapping() {
		return "Server is up & running !";
	}
}
