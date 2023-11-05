package com.xworkz.exception.app;

public class Person {

	public void drink() {
		System.out.println("invoking the drink in Person");
		walk();
	}

	public void walk() {
		System.out.println("invoking the walk in Person");
		dance();
	}

	public void dance() {
		System.out.println("invoking the dance in Person");
		sing();
	}

	public void sing() {
		System.out.println("invoking the sing in Person");
		try {
			sleep();
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("Exception event is handled");
		}
		System.out.println("after handling");
	}

	public void sleep() {
		System.out.println("invoking the sleep in Person");
		throw new SecurityException(" I am create for learn.........");
	}

}
