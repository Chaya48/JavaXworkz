package com.xworkz.overRide.app;

public class GoldBangle extends Bangle {
	public GoldBangle() {
		System.out.println("invoking no-args in GoldBangle");
	}

	@Override
	public void sound() {
		System.out.println("invoking sound in GoldBangle");
	}
}
