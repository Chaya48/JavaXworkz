package com.xworkz.app.boot.inheritance.eight;

public class Projector extends Printer{

	int quantity=1;
	
	public Projector() {
		System.out.println("default constructor of projector");
	}
	
	public void projectorMethod() {
		System.out.println("running in projector method");
		System.out.println("projjector quantity is "+quantity);
	}
}
