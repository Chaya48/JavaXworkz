package com.xworkz.toString.app;

public class Logo {

	private String color;
	private int width;
	private int length;
	private String shape;
	private int numberOfWords;

	public Logo() {
		System.out.println("invoking no-args constructor in logo");
	}

	public Logo(String color, int width, int length, String shape, int numberOfWords) {
		super();
		this.color = color;
		this.width = width;
		this.length = length;
		this.shape = shape;
		this.numberOfWords = numberOfWords;
	}

	@Override
	public String toString() {
		return "color :" + this.color + "\n" + "width :" + this.width + "\n" + "length :" + this.length + "\n"
				+ "Shape :" + this.shape + "\n" + "Number of words :" + this.numberOfWords;
	}

}
