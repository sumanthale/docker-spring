package com.cts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/hi")
	public String sayHi() {
		return "Welcome!...";
	}
	
	@GetMapping("/greet")
	public String sayHello() {
		return "Greeting from Hello controller";
	}
}
