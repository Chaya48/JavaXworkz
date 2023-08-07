package com.xworkz.methods.app;

public class Mouse {

	public String brand;
	public double price;
	
	public void move() {
		System.out.println("invoking no-args in mouse");
		System.out.println("mouse brand is :"+brand);
		System.out.println("Mouse price is :"+price);
		move("HP");
		move(698);
	}
	public void move(String brand) {
		System.out.println("invoking String parameter in mouse");
		System.out.println("mouse brand is :"+brand);
	}
	public void move(double price) {
		System.out.println("invoking double parameter in mouse");
		System.out.println("mouse price is :"+price);
	}
	public void move(String brand,double price) {
		System.out.println("invoking String,double parameter in mouse");
		System.out.println("mouse brand is :"+brand);
		System.out.println("Mouse price is :"+price);
		move(brand);
		move(price);
	}
}
