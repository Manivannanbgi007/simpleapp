package com.simpleapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {
	private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	//private int count;
	
	@GetMapping("/simple")
	String app() {
		logger.info("---------------");
		logger.info(">>>>>>>>>");
		logger.info("welcome to Simple App!");
		return "Hello from Simple App!";
	}
	
	@GetMapping("/count")
	String getCount() {
		logger.info("*******Count is not implemented yet.*******");
		return "Count is not implemented yet.";
	}
	
}
