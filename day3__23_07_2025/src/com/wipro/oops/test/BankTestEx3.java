package com.wipro.oops.test;

import com.wipro.oops.BankOpsEx3;
import com.wipro.oops.CitiEx3;
import com.wipro.oops.HDFCEx3;

public class BankTestEx3 {
	public static void main(String[] args) {
        BankOpsEx3 hdfc = new HDFCEx3(5000);
        BankOpsEx3 citi = new CitiEx3(10000);

        hdfc.deposit(2000, "HDFC123");
        hdfc.withdraw(1000, "HDFC123");
        System.out.println(hdfc);

        System.out.println();

        citi.deposit(3000, "CITI456");
        citi.withdraw(12000, "CITI456"); 
        System.out.println(citi);
    }
}
