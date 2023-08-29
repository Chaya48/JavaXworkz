package com.xworkz.has.app;

public class Trainer {

	private String name;
	Laptop laptop;

	public Trainer(String name) {
		this.name = name;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void teach() {
		System.out.println("invoking teach in Trainer");
		this.laptop.programming();
	}
}
