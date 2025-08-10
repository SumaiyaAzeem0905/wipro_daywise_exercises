package com.wipro.oops;

public class HDFCEx3 implements BankOpsEx3{

	private double balance;

    public HDFCEx3(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("HDFC: Deposited " + amount + " into account " + accNumber);
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdrawn " + amount + " from account " + accNumber);
        } else {
            System.out.println("HDFC: Insufficient funds in account " + accNumber);
        }
        return balance;
    }

    @Override
    public String toString() {
        return "HDFC Balance: " + balance;
    }

}
