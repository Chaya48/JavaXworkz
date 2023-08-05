package com.xworkz.chaining.app;

public class Rope {

	public String material;
	public String color;
	public double price;
	public String manufacturer; 
	
	public Rope(String material, String color, double price, String manufacturer) {
		
		System.out.println("invoking String, String, double, String constructor in rope");
		this.material=material;
		this.color=color;
		this.price=price;
		this.manufacturer=manufacturer;
		
	}
}
