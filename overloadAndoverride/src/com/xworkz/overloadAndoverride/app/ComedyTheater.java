package com.xworkz.overloadAndoverride.app;

public class ComedyTheater extends Theater {
	public ComedyTheater() {
		System.out.println("invoking no-args constructor in ComedyTheater");
	}

	@Override
	public void entertainment() {
		System.out.println("invoking no-args in ComedyTheater");
	}

	@Override
	public void entertainment(String name) {
		System.out.println("invoking String parameter in ComedyTheater");
	}

	@Override
	public void entertainment(String name, String location) {
		System.out.println("invoking String,String parameter in ComedyTheater");
	}

	@Override
	public void entertainment(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in ComedyTheater");
	}

	@Override
	public void entertainment(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in ComedyTheater");
	}

	@Override
	public void entertainment(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in ComedyTheater");
	}
}
