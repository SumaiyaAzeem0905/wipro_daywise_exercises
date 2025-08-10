package com.wipro.CarRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.CarRegistration.entity.Car;
import com.wipro.CarRegistration.repo.CarRepository;

@Service
public class CarService {
	@Autowired
    private CarRepository carRepository;

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car getById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    public Car update(Long id, Car updatedCar) {
        Car car = getById(id);
        if (car != null) {
            car.setMake(updatedCar.getMake());
            car.setRegistrationDetail(updatedCar.getRegistrationDetail());
            return carRepository.save(car);
        }
        return null;
    }
}
