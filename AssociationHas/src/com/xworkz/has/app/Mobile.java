package com.xworkz.has.app;

public class Mobile {
	private String brand;
	private double price;
	private String color;
	private int ramSize;
	private Charger charger;

	public Mobile(String brand) {
		this.brand = brand;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public void calling() {
		System.out.println("invoking calling in mobile");
		this.charger.charging();
	}

	public void text() {
		System.out.println("invoking text in mobile");
		this.charger.rechargering();
	}

	public void search() {
		System.out.println("invoking search in mobile");
		this.charger.storesEnergy();

	}

	public void email() {
		System.out.println("invoking email in mobile");
		this.charger.input();
	}

}
