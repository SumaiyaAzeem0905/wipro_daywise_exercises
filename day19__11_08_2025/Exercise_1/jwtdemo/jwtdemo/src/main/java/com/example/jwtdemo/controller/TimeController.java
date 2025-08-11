package com.example.jwtdemo.controller;



import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
	@GetMapping("/getCurrentTime")
    public ResponseEntity<?> getCurrentTime() {
        return ResponseEntity.ok(Map.of("currentTime", LocalDateTime.now().toString()));
    }
}
