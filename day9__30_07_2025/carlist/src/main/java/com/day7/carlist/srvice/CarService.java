package com.day7.carlist.srvice;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.carlist.repo.CarRepo;


@Service
public class CarService {
	 @Autowired
	    private CarRepo repo;

	    public List<String> fetchCarList() {
	        return repo.getProductList();
	    }
}
