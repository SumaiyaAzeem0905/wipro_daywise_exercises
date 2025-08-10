package com.example.LetsGo.controller;


import com.example.LetsGo.entity.VehicleMovement;
import com.example.LetsGo.repo.VehicleRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {
	@Autowired
    private VehicleRepository repo;

    @PostMapping("/move")
    public String moveVehicle(@RequestBody VehicleMovement vehicleMovement) {
        repo.save(vehicleMovement);
        return "Movement saved successfully!";
    }
    @GetMapping("/move")
    public List<VehicleMovement> getAllMovements() {
    	return repo.findAll();
    }

}
