package com.xworkz.app;

public class Company {
	public String name;
	public String ceo;
	public String originCountry;
	
	public Company(String name,String ceo,String originCountry){
		this.name=name;
		this.ceo=ceo;
		this.originCountry=originCountry;
	}
	
	public void printInfo() {
		System.out.println("name is :"+name);
		System.out.println("ceo is :"+ceo);
		System.out.println("origin country is :"+originCountry);
	}

}
