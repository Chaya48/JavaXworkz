package com.xworkz.chaining.app;

public class Ground {

	public String name;
	public float open;
	public float close;
	public String location;
	
	public Ground(String name, float open, float close, String location) {
		System.out.println("invoking string,float,float,string constructor in ground");
		this.name=name;
		this.open=open;
		this.close=close;
		this.location=location;
	}
}
