package com.wipro.weatherapp.controller;

import com.wipro.weatherapp.dto.Mobile;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataController {

    @PostMapping("/mobile")
    public String receiveMobile(@RequestBody Mobile mobile) {
        System.out.println("Received Mobile Details:");
        System.out.println("Make: " + mobile.getMake());
        System.out.println("Model Number: " + mobile.getModelNumber());
        System.out.println("Price: " + mobile.getPrice());

        return "Mobile data received successfully!";
    }
}
