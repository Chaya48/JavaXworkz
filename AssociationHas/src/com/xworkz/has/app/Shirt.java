package com.xworkz.has.app;

public class Shirt {

	private String brand;
	private Button button;

	public Shirt(String brand) {
		this.brand = brand;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void coveringBody() {
		System.out.println("invoking coveringBody in shirt");
		this.button.joins();
	}
}
