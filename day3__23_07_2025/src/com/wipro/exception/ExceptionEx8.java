package com.wipro.exception;

public class ExceptionEx8 {
	public static double changeCurrency(double number) throws NumberFormatException {
        if (number == 0) {
            throw new NumberFormatException("Invalid Number");
        }
        return number * 80;
    }

    public static void main(String[] args) {
        try {
            double result = changeCurrency(0);
            System.out.println("Converted amount: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
