package com.xworkz.methods.app;

public class Stapler {

	public double price;
	public String brand;
	
	public void joingPapersTogether() {
		System.out.println("invoking no-args in Stapler");
		System.out.println("price is :"+price);
		System.out.println("brand is :"+brand);
		joingPapersTogether(price);
		joingPapersTogether(brand);
	}
	public void joingPapersTogether(double price) {
		System.out.println("invoking double parameter in stapler");
		System.out.println("price is :"+price);
	}
	public void joingPapersTogether(String brand) {
		System.out.println("invoking String parameter in stapler");
		System.out.println("brand is :"+brand);
	}
	public void joingPapersTogether(double price,String brand) {
		System.out.println("invoking double,String parameter in Stapler");
		System.out.println("price is :"+price);
		System.out.println("brand is :"+brand);
		joingPapersTogether(2210);
		joingPapersTogether("MAX USA CORP");
	}
}
