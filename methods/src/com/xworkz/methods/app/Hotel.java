package com.xworkz.methods.app;

public class Hotel {

	public String location;
	public double cost;
	
	public void food() {
		System.out.println("invoking no-args in Hotel");
		System.out.println("location is :"+location);
		System.out.println("cost is :"+cost);
		food(location);
		food(cost);
	}
	
	public void food(String location) {
		System.out.println("invoking string parameter in Hotel");
		System.out.println("location is :"+location);
	}
	public void food(double cost) {
		System.out.println("invoking double parameter in Hotel");
		System.out.println("cost is :"+cost);
	}
	public void food(String location,double cost) {
		System.out.println("invoking string,double parameter in Hotel");
		System.out.println("location is :"+location);
		System.out.println("cost is :"+cost);
		food("Hassan");
		food(150);
	}
}
