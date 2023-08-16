package com.xworkz.toString.app;

public class Pendant {

	private String name;
	private String material;
	private String design;
	private String color;
	private String gameStone;
	private String chainType;
	private int size;
	private int weight;
	private float price;
	private String occasion;
	private String countryOfOrigin;
	private String ownerName;

	public Pendant() {
		System.out.println("invoking no-args constructor in Pandant");
	}

	public Pendant(String name, String material, String design, String color, String gameStone, String chainType,
			int size, int weight, float price, String occasion, String countryOfOrigin, String ownerName) {
		super();
		this.name = name;
		this.material = material;
		this.design = design;
		this.color = color;
		this.gameStone = gameStone;
		this.chainType = chainType;
		this.size = size;
		this.weight = weight;
		this.price = price;
		this.occasion = occasion;
		this.countryOfOrigin = countryOfOrigin;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "name :" + this.name +"\n" +"material :" + this.material + "\n"+"design :" + this.design +"\n"+ "color :" + this.color
				+ "\n"+"gameStone :" + this.gameStone +"\n"+ "chain Type :" + this.chainType +"\n"+ "size :" + this.size +"\n"+ "weight :"
				+ this.weight +"\n"+ "price :" + this.weight +"\n"+ "occasion :" + this.occasion+"\n" + "Country of Origin :"
				+ this.countryOfOrigin + "\n"+"owner Name :" + this.ownerName;
	}
}
