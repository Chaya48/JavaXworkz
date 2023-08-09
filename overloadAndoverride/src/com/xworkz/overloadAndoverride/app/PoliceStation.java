package com.xworkz.overloadAndoverride.app;

public class PoliceStation {
	public PoliceStation() {
		System.out.println("invoking no-args costructor in PoliceStation");
	}

	public void preventsCrime() {
		System.out.println("invoking no-args in PoliceStation");
	}

	public void preventsCrime(String name) {
		System.out.println("invoking String parameter in PoliceStation");
	}

	public void preventsCrime(String name, String location) {
		System.out.println("invoking String,String parameter in PoliceStation");
	}

	public void preventsCrime(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in PoliceStation");
	}

	public void preventsCrime(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in PoliceStation");
	}

	public void preventsCrime(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in PoliceStationF");
	}
}
