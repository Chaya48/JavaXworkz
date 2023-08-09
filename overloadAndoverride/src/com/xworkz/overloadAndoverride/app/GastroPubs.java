package com.xworkz.overloadAndoverride.app;

public class GastroPubs extends Pub {
	public GastroPubs() {
		System.out.println("invoking no-args constructor in GastroPubs");
	}

	@Override
	public void drink() {
		System.out.println("invoking no-args in GastroPubs");
	}

	@Override
	public void drink(String name) {
		System.out.println("invoking String parameter in GastroPubs");
	}

	@Override
	public void drink(String name, String location) {
		System.out.println("invoking String,String parameter in GastroPubs");
	}

	@Override
	public void drink(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in GastroPubs");
	}

	@Override
	public void drink(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in GastroPubs");
	}

	@Override
	public void drink(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in GastroPubs");
	}
}
