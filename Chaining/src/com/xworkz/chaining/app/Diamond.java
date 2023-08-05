package com.xworkz.chaining.app;

public class Diamond {

	public double price;
	public String crystalSystem;
	public String streak;
	public double disersion;
	
	public Diamond(double price, String crystalSystem, String streak, double disersion) {
		System.out.println("invoking double,String, String,double constructor in diamond");
		this.price=price;
		this.crystalSystem=crystalSystem;
		this.streak=streak;
		this.disersion=disersion;
	}
}
