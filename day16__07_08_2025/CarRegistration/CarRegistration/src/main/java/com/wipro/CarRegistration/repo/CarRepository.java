package com.wipro.CarRegistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.CarRegistration.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}
