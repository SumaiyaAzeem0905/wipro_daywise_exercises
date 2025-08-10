package com.wipro.oops;

public class HumanEx4 extends AnimalEx4{
	public HumanEx4(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Hello!");
    }
}
