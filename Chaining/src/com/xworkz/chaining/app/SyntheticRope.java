package com.xworkz.chaining.app;

public class SyntheticRope extends Rope {

	public SyntheticRope() {
		
		super("cotton","white",950,"Saifpro");
		System.out.println("invoking no-args constructor in sytheticrope");
	}
	
	public SyntheticRope(String material,String color,double price,String manufaturer) {
		super(material,color,price,manufaturer);
		System.out.println("invoking String,string,double,String constructor in syntheticRope");
	}
}
