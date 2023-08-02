package com.xworkz.app;

public class Area {

	public String name;
	public Corporator corporator;
	public Area(String name, Corporator corporator) {
		this.name=name;
		this.corporator=corporator;
	}
	public void printInfo() {
		System.out.println("name is :"+name);
		System.out.println("corporator is :"+corporator);
	}
}
