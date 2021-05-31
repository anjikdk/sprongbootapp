package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		System.out.println("main method");
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<String>("Welcome", HttpStatus.OK);
	}

}
