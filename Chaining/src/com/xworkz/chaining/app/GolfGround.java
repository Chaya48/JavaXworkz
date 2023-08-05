package com.xworkz.chaining.app;

public class GolfGround extends Ground{

	public GolfGround() {
		super("East West Cricket Ground",7f,7.30f,"BEL Layout");
		System.out.println("invoking no-args constructor in goifGround");
	}
	
	public GolfGround(String name,float open,float close,String location) {
		super(name,open,close,location);
		System.out.println("invoking String,float,float,String constructor in goilGround ");
	}
}
