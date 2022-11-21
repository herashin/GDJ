package com.projectTeam2.best_controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	
	
	
	
}
