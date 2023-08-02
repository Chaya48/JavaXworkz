package com.xworkz.app.boot.inheritance.eight;

public class Printer extends Tv {

	public double cost=10000;
	
	public Printer() {
		System.out.println("default constructor of printer");
	}
	
	public void printerMethod() {
		System.out.println("running in printer method");
		System.out.println("printer cost is "+cost);
	}
}
