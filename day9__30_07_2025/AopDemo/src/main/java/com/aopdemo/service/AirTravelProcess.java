package com.aopdemo.service;

import com.aopdemo.exception.NoSeatAvailableException;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;
@Component
public class AirTravelProcess {
	public void checkIn(Boolean flag) throws NoSeatAvailableException {
        if (flag) {
            System.out.println("Check-in successful.");
        } else {
            throw new NoSeatAvailableException(" No seats available for check-in.");
        }
    }

    public void collectBoardingPass() {
        System.out.println(" Boarding pass collected.");
    }

    public void doSecurityCheck() {
        System.out.println(" Security check completed.");
    }

    public void doBoarding() {
        System.out.println(" Boarding completed.");
    }
	
}
