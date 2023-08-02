package com.xworkz.app.boot.inheritance.eight;

public class Laptop extends Destop{

	public String name="Lenovo";
	public Laptop() {
		System.out.println("default constructor of laptop");
	}
	public void laptopMethod() {
		System.out.println("running in laptop mathod");
		System.out.println("laptop name is :"+name);
	}
}
