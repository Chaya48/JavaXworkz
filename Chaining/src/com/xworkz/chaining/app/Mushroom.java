package com.xworkz.chaining.app;

public class Mushroom {

	public String type;
	public int number;
	public double price;
	public char size;
	
	public Mushroom(String type,int number,double price,char size) {
		
		System.out.println("String, int, double, char constructor of mushroom");
		this.type=type;
		this.number=number;
		this.price=price;
		this.size=size;
	}
}
