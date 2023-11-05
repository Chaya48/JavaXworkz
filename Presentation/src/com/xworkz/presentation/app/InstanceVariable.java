package com.xworkz.presentation.app;

public class InstanceVariable {

	public String name;

	public static int age;

	public InstanceVariable(String location) {
		System.out.println("constructor :" + location);
	}

	public void person(String brand) {
		System.out.println("instance method :" + name);
	}

	public static void qualification() {
		System.out.println("static method :" + age);
	}
}
