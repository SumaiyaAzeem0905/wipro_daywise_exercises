package com.wipro.oops;

public class CitiEx3 implements BankOpsEx3{
	private double balance;

    public CitiEx3(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("Citi: Deposited " + amount + " into account " + accNumber);
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Citi: Withdrawn " + amount + " from account " + accNumber);
        } else {
            System.out.println("Citi: Insufficient funds in account " + accNumber);
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Citi Balance: " + balance;
    }

}
