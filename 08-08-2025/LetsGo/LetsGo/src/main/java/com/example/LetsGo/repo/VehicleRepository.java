package com.example.LetsGo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LetsGo.entity.VehicleMovement;

public interface VehicleRepository extends JpaRepository<VehicleMovement, Long>{

}
