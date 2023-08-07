package com.xworkz.methods.app;

public class Ladder {

	public int weight;
	public double height;
	
	public void fold() {
		System.out.println("invoking no-args in ladder");
		System.out.println("weight is :"+weight);
		System.out.println("height is :"+height);
		fold(weight);
		fold(height);
	}
	public void fold(int weight) {
		System.out.println("invoking int parameter in ladder");
		System.out.println("weight is :"+weight);
	}
	public void fold(double height) {
	System.out.println("invoking double parameter in ladder");
	System.out.println("height is :"+height);
	}
	public void fold(int weight,double height) {
		System.out.println("invoking int,double parameter in ladder");
		System.out.println("weight is :"+weight);
		System.out.println("height is :"+height);
		fold(12);
		fold(2.5);
	}
}
