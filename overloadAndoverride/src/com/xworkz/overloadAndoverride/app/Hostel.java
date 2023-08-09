package com.xworkz.overloadAndoverride.app;

public class Hostel {
	public Hostel() {
		System.out.println("invoking no-arg constructor in Hostel");
	}

	public void stay() {
		System.out.println("invoking no-args in Hostel");
	}

	public void stay(String name) {
		System.out.println("invoking String parameter in Hostel");
	}

	public void stay(String name, String location) {
		System.out.println("invoking String,String parameter in Hostel");
	}

	public void stay(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in Hostel");
	}

	public void stay(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in Hostel");
	}

	public void stay(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in hHostelotel");
	}
}
