package com.cg.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@GetMapping("api/display")
	public String display() {
		return "Hello";
		
	}
	
	

}
