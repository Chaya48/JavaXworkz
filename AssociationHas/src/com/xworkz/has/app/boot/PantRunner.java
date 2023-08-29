package com.xworkz.has.app.boot;

import com.xworkz.has.app.Pant;
import com.xworkz.has.app.Zip;

public class PantRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PantRunner");

		String brand = "nike";
		Zip zip = new Zip();

		Pant pant = new Pant(brand);
		pant.setZip(zip);
		pant.washing();
	}

}
