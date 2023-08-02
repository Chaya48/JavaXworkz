package com.xworkz.app;

public class Toothpaste {

	public String name;
	public String brand;
	public Company company;
	public Ingredent[] ingredent;
	
	public Toothpaste(String name,String brand,Company company,Ingredent[] ingredent){
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredent=ingredent;
	}
	public void printInfo() {
		System.out.println("toothpaste name is :"+this.name);
		System.out.println("toothpaste brand is :"+this.brand);
		System.out.println("toothpaste company is :"+this.company);
		
		for(int i=0; i<this.ingredent.length; i++) {
			Ingredent ref=ingredent[i];
			ref.printInfo();
		}
	}
	
}
