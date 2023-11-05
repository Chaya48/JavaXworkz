package com.xworkz.dasara.app;

public class City {

	public static void main(String[] args) {

		String city1 = "hassan";
		String city2 = "banglore";
		String city3 = "mysuru";
		String city4 = "madya";
		String city5 = "davanagere";
		String city6 = "darvad";
		String city7 = "kolar";
		String[] cities = { city1, city2, city3, city4, city5, city6, city7 };
		int total = cities.length;
		for (int index = 0; index < cities.length ; index++) {
			String ref = cities[index];
			System.out.println(ref);
		}

	} 
}
