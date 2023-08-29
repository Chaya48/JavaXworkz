package com.xworkz.has.app.boot;

import com.xworkz.has.app.Charger;
import com.xworkz.has.app.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MobileRunner");

		String brand = "onePluse";
		double price = 25000;
		String color = "black";
		int ramSize = 128;
		Charger charger = new Charger();

		Mobile mobile = new Mobile(brand);
		mobile.setCharger(charger);
		mobile.calling();
		System.out.println("\n");
		mobile.text();
		System.out.println("\n");
		mobile.search();
		System.out.println("\n");
		mobile.email();
	}

}
