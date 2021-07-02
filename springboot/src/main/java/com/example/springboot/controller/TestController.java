package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.AppProperties;
import com.example.springboot.model.Menu;

@RestController
public class TestController {
	
	@Autowired
	private AppProperties appProperties;
	
	@GetMapping("/test")
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<String>("Welcome", HttpStatus.OK);
	}

	@GetMapping("/testApp")
	public List<Menu> getMenuDetails()
	{
		return appProperties.getMenus();
	}
}
