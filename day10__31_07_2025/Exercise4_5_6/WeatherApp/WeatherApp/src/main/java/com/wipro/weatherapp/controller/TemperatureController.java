package com.wipro.weatherapp.controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class TemperatureController {
	@GetMapping("/tocentigrade/{fahrenheit}")
    public String convertToCentigrade(@PathVariable double fahrenheit) {
        double centigrade = (fahrenheit - 32) * 5 / 9;
        return String.format("%.2f°F is %.2f°C", fahrenheit, centigrade);
    }

}
