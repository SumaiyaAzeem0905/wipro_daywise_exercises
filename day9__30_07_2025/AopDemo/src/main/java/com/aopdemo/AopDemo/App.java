package com.aopdemo.AopDemo;
import com.aopdemo.config.AppConfig;
import com.aopdemo.service.AirTravelProcess;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AirTravelProcess travelProcess = context.getBean(AirTravelProcess.class);

        try {
            travelProcess.checkIn(false); // change to true to simulate successful check-in
            travelProcess.collectBoardingPass();
            travelProcess.doSecurityCheck();
            travelProcess.doBoarding();
        } catch (Exception e) {
            // Already handled in the aspect
        }

        context.close();
    }
    }

