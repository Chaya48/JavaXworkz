package com.xworkz.methods.app;

public class Specs {

	public double price;
	public String frameShape;
	
	public void seeing() {
		System.out.println("invoking no-args in Specs");
		System.out.println("price is :"+price);
		System.out.println("frame shape is :"+frameShape);
		seeing(price);
		seeing(frameShape);
	}
	public void seeing(double price) {
		System.out.println("invoking double parameter in Specs ");
		System.out.println("price is :"+price);
	}
	public void seeing(String frameShape) {
		System.out.println("invoking String parameter in Specs ");
		System.out.println("frame shape is :"+frameShape);
	}
	public void seeing(double price,String frameShape) {
		System.out.println("invoking double,String parameter in Specs ");
		System.out.println("price is :"+price);
		System.out.println("frame shape is :"+frameShape);
		seeing(559);
		seeing("Rectangle");
	
	}
}

