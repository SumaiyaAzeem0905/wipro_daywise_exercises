package com.wipro.oops;

public class PhonePayEx6 implements PaymentMethodEx6 {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePay");
    }

}
