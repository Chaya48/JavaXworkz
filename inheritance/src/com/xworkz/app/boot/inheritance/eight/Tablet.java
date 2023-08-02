package com.xworkz.app.boot.inheritance.eight;

public class Tablet extends Mobile{

	public String color="Black";
	
	public Tablet() {
		System.out.println("default constructor of the tablet");
	}
	
	public void tabletMethod() {
		System.out.println("running in tablet method");
		System.out.println("tablet color is "+color);
	}
}
