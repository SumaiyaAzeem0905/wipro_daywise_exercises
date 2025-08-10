package com.wipro.SecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	 @GetMapping("/greet")
	    public String greet() {
	        return "Hello from Greet";
	    }
	 @GetMapping("/secure")
	    public String secure() {
	        return "This is a secure page - Login required.";
	    }

	    @GetMapping("/admin")
	    public String admin() {
	        return "Admin Page - Authenticated access.";
	    }

}
