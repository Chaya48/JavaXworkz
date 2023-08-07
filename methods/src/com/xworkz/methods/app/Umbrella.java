package com.xworkz.methods.app;

public class Umbrella {

	public double price;
	public int number;
	
	public void protectFromRain() {
		System.out.println("invoking no-args in Umbrella");
		System.out.println("price is :"+price);
		System.out.println("number is :"+number);
		protectFromRain(price);
		protectFromRain(number);
	}
	public void protectFromRain(double price) {
		System.out.println("invoking double parameter in Umbrella");
		System.out.println("price is :"+price);
	}
	public void protectFromRain(int number) {
		System.out.println("invoking int parameter in Umbrella");
		System.out.println("number is :"+number);
	}
	public void protectFromRain(double price,int number) {
		System.out.println("invoking double,int  parameter in Umbrella");
		System.out.println("price is :"+price);
		System.out.println("number is :"+number);
		protectFromRain(450);
		protectFromRain(1);
	}
}
