package com.xworkz.has.app;

public class Passenger {

	private String name;
	private Bus bus;

	public Passenger(String name) {
		this.bus = bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public void travel() {
		System.out.println("invoking travel in Passenger");
		this.bus.move();
	}
}
