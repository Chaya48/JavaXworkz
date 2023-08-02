package com.xworkz.app.boot.inheritance.eight;

public class Mobile extends Laptop {

	float price=25000;
	
	public Mobile() {
		System.out.println("default constructor of the mobile");
	}
	
	public void mobileMethod() {
		System.out.println("running in mobile method");
		System.out.println("mobile price is :"+price);
	}
}
