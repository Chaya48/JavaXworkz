package com.xworkz.overloadAndoverride.app;

public class Mall {
	public Mall() {
		System.out.println("invoking no-args constructor in Mall");
	}

	public void shop() {
		System.out.println("invoking no-args in Mall");
	}

	public void shop(String name) {
		System.out.println("invoking String parameter in Mall");
	}

	public void shop(String name, String location) {
		System.out.println("invoking String,String parameter in Mall");
	}

	public void shop(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in Mall");
	}

	public void shop(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in Mall");
	}

	public void shop(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in Mall");
	}
}
