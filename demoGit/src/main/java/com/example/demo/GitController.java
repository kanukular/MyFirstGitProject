package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
	@RequestMapping(value="/")
	public String display() {
		return "Welcome to Git This is my first git projct";
	}
}
