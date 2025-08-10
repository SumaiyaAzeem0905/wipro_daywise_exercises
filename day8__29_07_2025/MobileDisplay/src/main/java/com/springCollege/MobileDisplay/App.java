package com.springCollege.MobileDisplay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Mobile mobile = context.getBean(Mobile.class);
        mobile.showMobileDetails();

        context.close();
    }
}
