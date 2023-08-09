package com.xworkz.overloadAndoverride.app;

public class Hospital {
	public Hospital() {
		System.out.println("invoking no-arg constructor in Hospital");
	}

	public void treatment() {
		System.out.println("invoking no-args in Hospital");
	}

	public void treatment(String name) {
		System.out.println("invoking String parameter in Hospital");
	}

	public void treatment(String name, String location) {
		System.out.println("invoking String,String parameter in Hospital");
	}

	public void treatment(String name, String location, int number) {
		System.out.println("invoking String,String,int  parameter in Hospital");
	}

	public void treatment(String name, String location, int number, double price) {
		System.out.println("invoking String,String,int,double  parameter in Hospital");
	}

	public void treatment(String name, String location, int number, double price, float open) {
		System.out.println("invoking String,String,int,double,float  parameter in Hospital");
	}
}
