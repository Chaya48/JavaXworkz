package com.xworkz.abs.app;

public abstract class Animal {

	public void makeSound() {
		System.out.println("invoking makeSound in Animal");
	}

	public void eat() {
		System.out.println("invoking eat in Animal");
	}

	public void sleep() {
		System.out.println("invoking sleep in Animal");
	}

	public void type() {
		System.out.println("invoking type in Animal");
	}

	public void isPet() {
		System.out.println("invoking isPet in Animal");
	}

	public abstract void displayInfo();

	public abstract void move();

	public abstract void printType();

	public abstract void needsGrooming();

	public abstract void printGromingStatus();
}
