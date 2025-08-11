package com.example.thymeleafdemo.model;


	import java.util.List;

	public class Person {
	    private String firstName;
	    private boolean isAdult;
	    private double salary;
	    private List<BankAccount> bankAccounts;

	    public Person() {}

	    public Person(String firstName, boolean isAdult, double salary, List<BankAccount> bankAccounts) {
	        this.firstName = firstName;
	        this.isAdult = isAdult;
	        this.salary = salary;
	        this.bankAccounts = bankAccounts;
	    }

	    public String getFirstName() { return firstName; }
	    public void setFirstName(String firstName) { this.firstName = firstName; }
	    public boolean isAdult() { return isAdult; }
	    public void setAdult(boolean adult) { isAdult = adult; }
	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }
	    public List<BankAccount> getBankAccounts() { return bankAccounts; }
	    public void setBankAccounts(List<BankAccount> bankAccounts) { this.bankAccounts = bankAccounts; }

	    @Override
	    public String toString() {
	        return "Person{" +
	                "firstName='" + firstName + '\'' +
	                ", isAdult=" + isAdult +
	                ", salary=" + salary +
	                ", bankAccounts=" + bankAccounts +
	                '}';
	    }
}
