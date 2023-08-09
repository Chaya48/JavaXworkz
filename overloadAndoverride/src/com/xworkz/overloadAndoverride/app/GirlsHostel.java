package com.xworkz.overloadAndoverride.app;

public class GirlsHostel extends Hostel {
	public GirlsHostel() {
		System.out.println("invoking no-arg constructor in GirlsHostel");
	}

	@Override
	public void stay() {
		System.out.println("invoking no-args in GirlsHostel");
	}

	@Override
	public void stay(String name) {
		System.out.println("invoking String parameter in GirlsHostel");
	}

	@Override
	public void stay(String name, String location) {
		System.out.println("invoking String,String parameter in GirlsHostel");
	}

	@Override
	public void stay(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in GirlsHostel");
	}

	@Override
	public void stay(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in GirlsHostel");
	}

	@Override
	public void stay(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in GirlsHostelFF");
	}
}
