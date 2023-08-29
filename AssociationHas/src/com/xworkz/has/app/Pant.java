package com.xworkz.has.app;

public class Pant {

	private String brand;
	private Zip zip;

	public Pant(String brand) {
		this.brand = brand;
	}

	public void setZip(Zip zip) {
		this.zip = zip;
	}

	public void washing() {
		System.out.println("invoking washing in Pant");
		this.zip.join();
	}
}
