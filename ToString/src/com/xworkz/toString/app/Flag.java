package com.xworkz.toString.app;

public class Flag {

	private String color;
	private int numberOfColor;
	private boolean isIndianFlag;

	public Flag() {
		System.out.println("invoking no-args constructor in flag");
	}

	public Flag(String color, int numberOfColor, boolean isIndianFlag) {
		super();
		this.color = color;
		this.numberOfColor = numberOfColor;
		this.isIndianFlag = isIndianFlag;
	}

	@Override
	public String toString() {
		return "color :" + this.color +"\n"+ "number of color :" + this.numberOfColor + "\n"+"is Indian flag :"
				+ this.isIndianFlag;

	}
}
