package com.xworkz.overloadAndoverride.app;

public class RegionalMall extends Mall {
	public RegionalMall() {
		System.out.println("invoking no-args constructor in RegionalMall");
	}

	@Override
	public void shop() {
		System.out.println("invoking no-arg in RegionalMall");
	}

	@Override
	public void shop(String name) {
		System.out.println("invoking String parameter in RegionalMall");
	}

	@Override
	public void shop(String name, String location) {
		System.out.println("invoking String,String parameter in RegionalMall");
	}

	@Override
	public void shop(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in RegionalMall");
	}

	@Override
	public void shop(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in RegionalMall");
	}

	@Override
	public void shop(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in RegionalMall");
	}
}
