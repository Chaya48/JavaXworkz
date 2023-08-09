package com.xworkz.overloadAndoverride.app;

public class Bakery {
	public Bakery() {
		System.out.println("invoking no-args constructor in bakery");
	}

	public void bake() {
		System.out.println("invoking no-args in bakery");
	}

	public void bake(String name) {
		System.out.println("invoking String in bakery");
	}

	public void bake(String name, int number) {
		System.out.println("invoking String,int in bakery");
	}

	public void bake(String name, int number, String location) {
		System.out.println("invoking String,int,String in bakery");
	}

	public void bake(String name, int number, String location, double price) {
		System.out.println("invoking String,int,String,double in bakery");
	}

	public void bake(String name, int number, String location, double price, float open) {
		System.out.println("invoking String,int,String,double,float in bakeryF");
	}
}
