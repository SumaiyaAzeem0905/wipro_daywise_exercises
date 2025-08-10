package com.wipro.oops;

public class BirdEx4 extends AnimalEx4{
	public BirdEx4(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet tweet!");
    }
}
