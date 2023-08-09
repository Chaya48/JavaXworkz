package com.xworkz.overloadAndoverride.app;

public class NagaraStyleTemple extends Temple {
	public NagaraStyleTemple() {
		System.out.println("invoking no-args constructor in NagaraStyleTemple");
	}

	@Override
	public void prayer() {
		System.out.println("invoking no-args in NagaraStyleTemple");
	}

	@Override
	public void prayer(String name) {
		System.out.println("invoking String parameter in NagaraStyleTemple");
	}

	@Override
	public void prayer(String name, String location) {
		System.out.println("invoking String,String parameter in NagaraStyleTemple");
	}

	@Override
	public void prayer(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in NagaraStyleTemple");
	}

	@Override
	public void prayer(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in NagaraStyleTemple");
	}

	@Override
	public void prayer(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in NagaraStyleTemple");
	}
}
