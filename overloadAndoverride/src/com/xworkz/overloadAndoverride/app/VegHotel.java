package com.xworkz.overloadAndoverride.app;

public class VegHotel extends Hotel {
	public VegHotel() {
		System.out.println("invoking no-args constructor in vegHotel");
	}

	@Override
	public void food() {
		System.out.println("invoking no-args in vegHotel");
	}

	@Override
	public void food(String name) {
		System.out.println("invoking String parameter in vegHotel");
	}

	@Override
	public void food(String name, String location) {
		System.out.println("invoking String,String parameter in vegHotel");
	}

	@Override
	public void food(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in vegHotel");
	}

	@Override
	public void food(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in vegHotelotel");
	}

	@Override
	public void food(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in vegHotel");
	}
}
