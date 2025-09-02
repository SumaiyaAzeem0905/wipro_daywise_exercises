package com.day15.orderms14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Orderms14Application {

	public static void main(String[] args) {
		SpringApplication.run(Orderms14Application.class, args);
	}

}
