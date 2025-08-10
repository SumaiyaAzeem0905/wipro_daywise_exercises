package com.wipro.oops.test;

import com.wipro.oops.GPayEx6;
import com.wipro.oops.PaymentMethodEx6;
import com.wipro.oops.PhonePayEx6;

public class PaymentTest {
	public static void main(String[] args) {
       
        PaymentMethodEx6 payment = new GPayEx6();
        payment.pay(500.0);

        payment = new PhonePayEx6();
        payment.pay(1000.0);
    }
}
