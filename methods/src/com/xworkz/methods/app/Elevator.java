package com.xworkz.methods.app;

public class Elevator {

	public float speed;
	public int length;
	
	public void transport() {
		System.out.println("invoking no-args in elevator");
		System.out.println("elevator speed is :"+speed);
		System.out.println("elevator length is :"+length);
		transport(20f);
		transport(30);
	}
	public void transport(float speed) {
		System.out.println("invoking float parameter in elevator");
		System.out.println("elevator speed is :"+speed);
	}
	public void transport(int length) {
		System.out.println("invoking int parameter in elevator");
		System.out.println("elevator length is :"+length);
	}
	public void transport(float speed,int length) {
		System.out.println("invoking float,int parameter in elevator");
		System.out.println("elevator speed is :"+speed);
		System.out.println("elevator length is :"+length);
		transport(speed);
		transport(length);
	}
}
