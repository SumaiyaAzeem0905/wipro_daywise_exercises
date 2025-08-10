package com.wipro.oops;

public class DogEx4 extends AnimalEx4{
	public DogEx4(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof woof!");
    }
}
