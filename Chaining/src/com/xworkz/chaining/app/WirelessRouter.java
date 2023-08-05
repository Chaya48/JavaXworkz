package com.xworkz.chaining.app;

public class WirelessRouter extends Router{
	
	public WirelessRouter() {
		super("D-Link","D-link 615",797,"black");
		System.out.println("invoking no- args constructor in wireless router");
	}
	
	public WirelessRouter(String brand,String modelName ,double price, String color) {
		super(brand,modelName,price,color);
		System.out.println("invoking string,string,double,string construdtor in wireless router");
	}

}
