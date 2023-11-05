package com.xworkz.chaining.app;

public class ButtonMushroom extends Mushroom {

	public ButtonMushroom() {
		super("Beech", 20, 60, 's');
		System.out.println("invoking no- args constructor in button mushroom");
	}

	public ButtonMushroom(String type, int number, double price, char size) {
		super(type, number, price, size);
		System.out.println("invoking string,int,double,char constructor in button mushroom");
	}
}
