package com.wipro.oops.test;

import com.wipro.oops.AnimalEx4;
import com.wipro.oops.BirdEx4;
import com.wipro.oops.DogEx4;
import com.wipro.oops.HumanEx4;

public class AnimalTest {
	public static void main(String[] args) {

        AnimalEx4 human = new HumanEx4("Alice", 25);
        AnimalEx4 bird = new BirdEx4("Tweety", 2);
        AnimalEx4 dog = new DogEx4("Buddy", 4);

        System.out.println(human);
        System.out.println(bird);
        System.out.println(dog);

        System.out.println();

        human.eat();
        bird.sleep();
        dog.eat();

        System.out.println();

        human.makeSound();
        bird.makeSound();
        dog.makeSound();
    }
}
