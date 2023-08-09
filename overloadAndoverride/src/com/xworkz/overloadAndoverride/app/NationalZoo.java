package com.xworkz.overloadAndoverride.app;

public class NationalZoo extends Zoo {
	public NationalZoo() {
		System.out.println("invoking no-args constructor in NationalZoo");
	}

	@Override
	public void exhibition() {
		System.out.println("invoking no-args in NationalZoo");
	}

	@Override
	public void exhibition(String name) {
		System.out.println("invoking String parameter in NationalZoo");
	}

	@Override
	public void exhibition(String name, String location) {
		System.out.println("invoking String,String parameter in NationalZoo");
	}

	@Override
	public void exhibition(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in NationalZoo");
	}

	@Override
	public void exhibition(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in NationalZoo");
	}

	@Override
	public void exhibition(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in NationalZoo");
	}
}
