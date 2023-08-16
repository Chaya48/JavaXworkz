package com.xworkz.toString.app;

public class Karchief {

	private String brand;
	private String type;
	private String color;
	private int price;
	private int size;
	private boolean washable;
	private boolean isEmbroidery;

	public Karchief() {
		System.out.println("invoking no-args constructor in Karchief");
	}

	public Karchief(String brand, String type, String color, int price, int size, boolean washable,
			boolean isEmbroidery) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
		this.size = size;
		this.washable = washable;
		this.isEmbroidery = isEmbroidery;
	}
	@Override
	public String toString() {
		return "brand :"+this.brand+"\n"+"type :"+this.type+"\n"+"color :"+this.color+"\n"+"price :"+this.price+"\n"+"size :"+this.size+"\n"+"washable :"+this.washable+"\n"+"is Embroidery :"+this.isEmbroidery;
	}
}
