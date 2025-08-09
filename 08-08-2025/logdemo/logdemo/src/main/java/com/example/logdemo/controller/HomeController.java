package com.example.logdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/greet")
    public String greet() {

        logger.error("-- Error level log --");
        logger.warn("-- Warn level log --");
        logger.info("-- Info level log --");
        logger.debug("-- Debug level log --");
        logger.trace("-- Trace level log --");

        return "Hello from greet!";
    }

}
