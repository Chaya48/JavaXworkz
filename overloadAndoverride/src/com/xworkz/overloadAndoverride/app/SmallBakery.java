package com.xworkz.overloadAndoverride.app;

public class SmallBakery extends Bakery {
	public SmallBakery() {
		System.out.println("invoking no-args constructor in small Bakery");
	}

	@Override
	public void bake() {
		System.out.println("invoking no-args in smallaBakery");
	}

	@Override
	public void bake(String name) {
		System.out.println("invoking String in smallaBakery");
	}

	@Override
	public void bake(String name, int number) {
		System.out.println("invoking String,int in smallaBakery");
	}

	@Override
	public void bake(String name, int number, String location) {
		System.out.println("invoking String,int,String in smallaBakery");
	}

	@Override
	public void bake(String name, int number, String location, double price) {
		System.out.println("invoking String,int,String,double in smallaBakery");
	}

	@Override
	public void bake(String name, int number, String location, double price, float open) {
		System.out.println("invoking String,int,String,double,float in smallaBakery");
	}
}
