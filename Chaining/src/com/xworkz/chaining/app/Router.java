package com.xworkz.chaining.app;

public class Router {

	public String brand;
	public String modelName;
	public double price;
	public String color;
	
	public Router(String brand, String modelName, double price, String color) {
		System.out.println("invoking string,string, double,String constuctor in router");
		this.brand=brand;
		this.modelName=modelName;
		this.price=price;
		this.color=color;
	}
	
}
