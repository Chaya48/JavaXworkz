package com.xworkz.chaining.app;

public class Coffe {

	public double price;
	public int  quantity;
	public String color;
	public boolean tasty;
	
	public Coffe(double price, int quantity, String color, boolean tasty) {
		System.out.println("invoking double,int,String,boolean constructor in coffe");
		this.price=price;
		this.quantity=quantity;
		this.color=color;
		this.tasty=tasty;
	}
}
