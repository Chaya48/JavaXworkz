package com.xworkz.overloadAndoverride.app;

public class AyurvedicHospital extends Hospital {
	public AyurvedicHospital() {
		System.out.println("invoking no-args constructor in AyurvedicHospital");
	}

	@Override
	public void treatment() {
		System.out.println("invoking no-args in AyurvedicHospital");
	}

	@Override
	public void treatment(String name) {
		System.out.println("invoking String parameter in AyurvedicHospital");
	}

	@Override
	public void treatment(String name, String location) {
		System.out.println("invoking String,String parameter in AyurvedicHospital");
	}

	@Override
	public void treatment(String name, String location, int number) {
		System.out.println("invoking String,String,int  parameter in AyurvedicHospital");
	}

	@Override
	public void treatment(String name, String location, int number, double price) {
		System.out.println("invoking String,String,int,double  parameter in AyurvedicHospital");
	}

	@Override
	public void treatment(String name, String location, int number, double price, float open) {
		System.out.println("invoking String,String,int,double,float  parameter in AyurvedicHospital");
	}
}
