package com.xworkz.methods.app;

public class Gadget {
     
	public String name;
	public double price;
	
	public void calling() {
		System.out.println("invoking no-args in Gadget");
		System.out.println("gadget name is :"+name);
		System.out.println("gadget price is :"+price);
		calling(name);
		calling(price);
	}
	public void calling(String name) {
		System.out.println("invoking string parameter in gadget");
		System.out.println("gadget name is :"+name);
	}
	public void calling(double price) {
		System.out.println("invoking double parameter in gadget");
		System.out.println("gadget price is :"+price);
	}
	public void calling(String name,double price) {
		System.out.println("invoking string,double parameter in gadget");
		System.out.println("gadget name is :"+name);
		System.out.println("gadget price is :"+price);
		calling("Mobile");
		calling(25000);
	}
}
