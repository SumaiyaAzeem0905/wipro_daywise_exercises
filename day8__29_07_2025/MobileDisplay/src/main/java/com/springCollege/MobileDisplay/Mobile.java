package com.springCollege.MobileDisplay;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private Display display;

    // Constructor-based DI
    public Mobile(Display display) {
        this.display = display;
    }

    public void showMobileDetails() {
        System.out.println("Mobile has a " + display);
    }

}
