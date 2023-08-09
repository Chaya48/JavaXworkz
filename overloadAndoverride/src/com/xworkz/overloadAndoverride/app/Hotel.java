package com.xworkz.overloadAndoverride.app;

public class Hotel {
	public Hotel() {
		System.out.println("invoking no-args constructor in Hotel");
	}
	public void food() {
		System.out.println("invoking no-args in hotel");
	}

	public void food(String name) {
		System.out.println("invoking String parameter in hotel");
	}

	public void food(String name, String location) {
		System.out.println("invoking String,String parameter in hotel");
	}

	public void food(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in hotel");
	}

	public void food(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in hotel");
	}

	public void food(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in hotel");
	}
}
