package com.xworkz.abs.boot;

import com.xworkz.abs.app.Highway;
import com.xworkz.abs.app.NationalHighway;

public class HighwayRunner {

	public static void main(String[] args) {

		Highway highway = new NationalHighway();
		highway.travel();
		highway.running();
		highway.walking();
		highway.distance();
		highway.type();
		highway.code();
		highway.system();
		highway.patrol();
		highway.highwayman();
		highway.signal();
	}

}
