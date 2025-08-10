package com.wipro.exception;

public class ExceptionEx7 {
	 public static void main(String[] args) {
	        String fName = null;

	        try {
	            System.out.println(fName.toUpperCase());
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: String is null.");
	        }
	    }
}
