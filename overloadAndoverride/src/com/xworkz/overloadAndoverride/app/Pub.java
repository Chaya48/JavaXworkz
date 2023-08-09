package com.xworkz.overloadAndoverride.app;

public class Pub {
	public Pub() {
		System.out.println("invoking no-args constructor in Pub");
	}

	public void drink() {
		System.out.println("invoking no-args in Pub");
	}

	public void drink(String name) {
		System.out.println("invoking String parameter in Pub");
	}

	public void drink(String name, String location) {
		System.out.println("invoking String,String parameter in Pub");
	}

	public void drink(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in Pub");
	}

	public void drink(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in Pub");
	}

	public void drink(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in Pub");
	}
}
