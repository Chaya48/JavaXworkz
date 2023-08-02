package com.xworkz.app;

public class Ingredent {

	public String name;
	public int quantity;
	public float cost;
	
	public Ingredent(String name,int quantity,float cost) {
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	public void printInfo() {
		System.out.println("name is :"+name);
		System.out.println("quantity is :"+quantity);
		System.out.println("cost is :"+cost);
	}
}
