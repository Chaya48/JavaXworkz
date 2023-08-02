package com.xworkz.app.boot.inheritance.eight;

public class Tv extends Tablet{

	public String type="LCD";
	
	public Tv() {
		System.out.println("default constructor in tv");
	}
	
	public void tvMethod() {
		System.out.println("running in tv method");
		System.out.println("tv type is "+type);
	}
}
