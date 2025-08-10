package com.day7.carlist.repo;


import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepo {
	public List<String> getProductList() {
        return Arrays.asList("Audi", "Mercedes", "BMW");
    }
}
