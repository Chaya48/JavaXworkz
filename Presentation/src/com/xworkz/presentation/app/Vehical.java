package com.xworkz.presentation.app;

public class Vehical {

	String name;
	double price;
	
	Vehical(String name,double price){
		System.out.println("parameter constructor");
		this.name=name;
		this.price=price;
	}
	
	public static void main(String[] args){
		
		Vehical vehical=new Vehical("bike",200000);
		System.out.println("name is :"+vehical.name);
		System.out.println("price is :"+vehical.price);
		
	}
}
