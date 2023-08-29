package com.xworkz.has.app;

import com.xworkz.has.app.boot.Processor;

public class Laptops {

	private String brand;
	private double price;
	private String color;
	private int ramSize;
	private Processor processor;
	
	public Laptops(String brand) {
		this.brand=brand;

	}
	public void setProcessor(Processor processor) {
		this.processor=processor;
	}
	public void typing() {
		System.out.println("invoking typing in laptops");
		this.processor.fetch();
	}
	public void watchingMove() {
		System.out.println("invoking watchingMove in laptops");
		this.processor.decode();
	}
	public void game() {
		System.out.println("invoking game in laptops");
		this.processor.execute();
	}
	public void paint() {
		System.out.println("invoking paint in laptops");
		this.processor.writeBak();
	}
}
