package com.wipro.oops;

public class GPayEx6 implements PaymentMethodEx6 {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using GPay");
    }
}
