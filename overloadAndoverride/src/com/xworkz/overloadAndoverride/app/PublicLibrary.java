package com.xworkz.overloadAndoverride.app;

public class PublicLibrary extends Library {
	public PublicLibrary() {
		System.out.println("invoking no-args constructor in PublicLibrary");
	}

	@Override
	public void store() {
		System.out.println("invoking no-args in PublicLibrary");
	}

	@Override
	public void store(String name) {
		System.out.println("invoking String parameter in PublicLibrary");
	}

	@Override
	public void store(String name, String location) {
		System.out.println("invoking String,String parameter in PublicLibrary");
	}

	@Override
	public void store(String name, String location, int number) {
		System.out.println("invoking String,String,int parameter in PublicLibrary");
	}

	@Override
	public void store(String name, String location, int number, float open) {
		System.out.println("invoking String,String,int,float parameter in PublicLibrary");
	}

	@Override
	public void store(String name, String location, int number, float open, float close) {
		System.out.println("invoking String,String,int,float,float  parameter in PublicLibrary");
	}
}
