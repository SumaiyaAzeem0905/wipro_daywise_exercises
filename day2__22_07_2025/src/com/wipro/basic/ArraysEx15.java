package com.wipro.basic;

public class ArraysEx15 {
	public static void main(String[] args) {
        int[] arr = {2, 19, 1, 3, 7}; 
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                    System.out.println("Indices: " + i + ", " + j);
                    return; 
                }
            }
        }
    }
}
