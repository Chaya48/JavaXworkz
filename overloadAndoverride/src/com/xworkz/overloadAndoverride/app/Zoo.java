package com.xworkz.overloadAndoverride.app;

public class Zoo {
	public Zoo() {
		System.out.println("invoking no-args constructor in Zoo");
	}

	public void exhibition() {
		System.out.println("invoking no-args in Zoo");
	}

	public void exhibition(String name) {
		System.out.println("invoking String parameter in Zoo");
	}

	public void exhibition(String name, String location) {
		System.out.println("invoking String,String parameter in Zoo");
	}

	public void exhibition(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in Zoo");
	}

	public void exhibition(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in Zoo");
	}

	public void exhibition(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in Zoo");
	}
}
