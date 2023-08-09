package com.xworkz.overloadAndoverride.app;

public class AlleyStreet extends Street {
	public AlleyStreet() {
		System.out.println("invoking no-args constructor in AlleyStreet");
	}

	@Override
	public void movement() {
		System.out.println("invoking no-args in AlleyStreet");
	}

	@Override
	public void movement(String name) {
		System.out.println("invoking String parameter in AlleyStreet");
	}

	@Override
	public void movement(String name, String location) {
		System.out.println("invoking String,String parameter in AlleyStreet");
	}

	@Override
	public void movement(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in AlleyStreet");
	}

	@Override
	public void movement(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in AlleyStreet");
	}

	@Override
	public void movement(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in AlleyStreet");
	}
}
