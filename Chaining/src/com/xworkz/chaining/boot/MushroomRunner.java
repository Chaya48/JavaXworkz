package com.xworkz.chaining.boot;

import com.xworkz.chaining.app.ButtonMushroom;
import com.xworkz.chaining.app.Mushroom;

public class MushroomRunner{

	public static void main(String[] args) {

		System.out.println("invoking main in mushroom runner ");

		Mushroom mushroom=new Mushroom("Chestnut",30,120,'m');
		System.out.println(mushroom.type);
		System.out.println(mushroom.number);
		System.out.println(mushroom.price);
		System.out.println(mushroom.size);
		System.out.println("\n");
		
		ButtonMushroom buttonMushroom=new ButtonMushroom();
		System.out.println(buttonMushroom.type);
		System.out.println(buttonMushroom.number);
		System.out.println(buttonMushroom.price);
		System.out.println(buttonMushroom.size);
		System.out.println("\n");
		
		ButtonMushroom buttonMushroom1=new ButtonMushroom("Enoki",4,80,'s');
		System.out.println(buttonMushroom1.type);
		System.out.println(buttonMushroom1.number);
		System.out.println(buttonMushroom1.price);
		System.out.println(buttonMushroom1.size);
	}

}
