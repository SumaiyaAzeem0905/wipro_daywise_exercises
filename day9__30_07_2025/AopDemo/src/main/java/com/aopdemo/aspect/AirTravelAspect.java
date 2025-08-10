package com.aopdemo.aspect;

import com.aopdemo.exception.NoSeatAvailableException;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;
@Aspect
@Component
public class AirTravelAspect {
	  @Before("execution(* com.aopdemo.service.AirTravelProcess.checkIn(..))")
	    public void showPhotoId() {
	        System.out.println("Show Photo ID before check-in.");
	    }

	    @Before("execution(* com.aopdemo.service.AirTravelProcess.doSecurityCheck(..)) || execution(* com.aopdemo.service.AirTravelProcess.doBoarding(..))")
	    public void showBoardingPass() {
	        System.out.println("Show boarding pass.");
	    }

	    @AfterThrowing(pointcut = "execution(* com.aopdemo.service.AirTravelProcess.checkIn(..))", throwing = "ex")
	    public void handleNoSeatException(NoSeatAvailableException ex) {
	        System.out.println("Exception Caught: " + ex.getMessage());
	    }

}
