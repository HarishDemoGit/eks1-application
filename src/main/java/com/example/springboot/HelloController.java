package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eks1")
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user")
	public String index() {
		return "Hello THIS IS EKS1!";
	}

	@PostMapping("/post")
	public String index_01(String name) {
		return "hi EKS";
	}

	@GetMapping("/call-eks2")
	public String callEks2() {
		String url = "http://eks2-service.default.svc.cluster.local:8086/eks2/user";
		return restTemplate.getForObject(url, String.class);
	}
}