package com.xworkz.abs.app;

public abstract class Bike {

	public void run() {
		System.out.println("invoking run in Bike");
	}

	public void stop() {
		System.out.println("invoking stop in Bike");
	}

	public void transportation() {
		System.out.println("invoking transportation in Bike");
	}

	public void recreation() {
		System.out.println("invoking recreation in Bike");
	}

	public void sport() {
		System.out.println("invoking sport in Bike");
	}

	public abstract void rotarymotion();

	public abstract void enginee();

	public abstract void fuel();

	public abstract void seat();

	public abstract void speed();
}
