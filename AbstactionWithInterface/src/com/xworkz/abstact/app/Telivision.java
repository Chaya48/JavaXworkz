package com.xworkz.abstact.app;

public class Telivision {

	private Power power;
	
	public void turnOn() {
		System.out.println("invoking turnOn on telivision");
		this.power.turnOn();
	}
	public void setPower(Power power) {
		this.power = power;
	}
}
