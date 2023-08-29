package com.xworkz.has.app.boot;

import com.xworkz.has.app.Farmer;
import com.xworkz.has.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in FarmerRunner ");
		String name = "chaya";
		Land land = new Land();

		Farmer farmer = new Farmer(name);
		farmer.setLand(land);

		farmer.farming();

	}

}
