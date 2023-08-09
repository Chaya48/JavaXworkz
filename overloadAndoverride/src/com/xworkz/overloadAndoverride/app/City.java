package com.xworkz.overloadAndoverride.app;

public class City {
	public City() {
		System.out.println("invoking no-args in City");
	}

	public void administrative() {
		System.out.println("invoking no-args in City");
	}

	public void administrative(String name) {
		System.out.println("invoking String parameter in City");
	}

	public void administrative(String name, String location) {
		System.out.println("invoking String,String parameter in City");
	}

	public void administrative(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in City");
	}

	public void administrative(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in City");
	}

	public void administrative(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in City");
	}
}
