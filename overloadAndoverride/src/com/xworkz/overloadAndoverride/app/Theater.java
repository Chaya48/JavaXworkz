package com.xworkz.overloadAndoverride.app;

public class Theater {
	public Theater() {
		System.out.println("invoking no-args constructor in Theater");
	}

	public void entertainment() {
		System.out.println("invoking no-args in Theater");
	}

	public void entertainment(String name) {
		System.out.println("invoking String parameter in Theater");
	}

	public void entertainment(String name, String location) {
		System.out.println("invoking String,String parameter in Theater");
	}

	public void entertainment(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in Theater");
	}

	public void entertainment(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in Theater");
	}

	public void entertainment(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in Theater");
	}
}
