package com.xworkz.equals.boot;

import com.xworkz.equals.app.Cook;

public class CookRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Cook runner");
		Cook cook = new Cook("darshan", "bangalore", 34, "5stars", "veg", 6500f);
		Cook cook2 = new Cook("darshan", "mysore", 65, "4stars", "veg", 6500f);
		boolean ref = cook.equals(cook2);
	}

}
