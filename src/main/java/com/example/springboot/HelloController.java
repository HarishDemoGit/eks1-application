package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/eks1")
public class HelloController {

	@GetMapping("/user")
	public String index() {
		return "Hello THIS IS EKS1!";
	}

	@PostMapping("/post")
	public String index_01(String name) {
		return "hi EKS";
	}
}