package com.xworkz.app;

public class Floor {

	public String name;
	public int number;
	public Floor(String name, int number) {
		this.name=name;
		this.number=number;
	}
	public void printInfo() {
		System.out.println("name is :"+name);
		System.out.println("number is :"+number);
	}
}
