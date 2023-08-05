package com.xworkz.chaining.app;

public class CappuccinoCoffe extends Coffe{
	
	public CappuccinoCoffe() {
		super(250,50,"brown",true);
		System.out.println("invoking no-args constructor in cappuccinocoffe");
	}
	
	public CappuccinoCoffe(double price, int quantity, String color, boolean tasty) {
		super(price,quantity,color,tasty);
		System.out.println("invoking double,int,String,boolean constructor in cappuccinocoffe");
	}

}
