package com.xworkz.overloadAndoverride.app;

public class Market {
	public Market() {
		System.out.println("invoking no-args constructor in Market");
	}

	public void selling() {
		System.out.println("invoking no-args in Market");
	}

	public void selling(String name) {
		System.out.println("invoking String parameter in Market");
	}

	public void selling(String name, String location) {
		System.out.println("invoking String,String parameter in Market");
	}

	public void selling(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in Market");
	}

	public void selling(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in Market");
	}

	public void selling(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in Market");
	}
}
