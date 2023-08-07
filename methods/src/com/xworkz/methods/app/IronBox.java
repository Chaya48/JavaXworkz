package com.xworkz.methods.app;

public class IronBox {
	public double price;
	public String brand;
	
	public void removeWrinkles() {
		System.out.println("invoking no-args method in Iron box");
		System.out.println("price is :"+price);
		System.out.println("brand is :"+brand);
		removeWrinkles(price,brand);
	}

	public void removeWrinkles(double price) {
		System.out.println("invoking double parameter in IronBox");
		System.out.println("price is :"+price);
	}
	
	public void removeWrinkles(String brand) {
		System.out.println("invoking string parameter in IronBox");
		System.out.println("brand is :"+brand);
	}
	public void removeWrinkles(double price,String brand) {
		System.out.println("invoking double,String parameter in IronBox");
		System.out.println("price is :"+price);
		System.out.println("brand is :"+brand);
		removeWrinkles(1500);
		removeWrinkles("Bajaj");
	}
}
