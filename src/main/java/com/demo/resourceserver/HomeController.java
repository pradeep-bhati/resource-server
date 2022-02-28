package com.demo.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/api/public/hello-world")
	public String helloWorld() {
		return "Hello World! This is anonymous response.";
	}
	
	@GetMapping("/api/hello-user")
	public String helloUser() {
		return "Hello World! This is normal user response.";
	}
	
	@GetMapping("/api/admin/hello-admin")
	public String helloAdmin() {
		return "Hello World! This is admin user response";
	}
}
