package com.xworkz.abs.boot;

import com.xworkz.abs.app.Animal;
import com.xworkz.abs.app.Cat;

public class AnimalRunner {

	public static void main(String[] args) {

		Animal animal=new Cat();
		animal.makeSound();
		animal.eat();
		animal.sleep();
		animal.type();
		animal.isPet();
		animal.displayInfo();
		animal.move();
		animal.printType();
		animal.needsGrooming();
		animal.printGromingStatus();
	}

}
