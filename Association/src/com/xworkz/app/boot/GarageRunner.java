package com.xworkz.app.boot;

import com.xworkz.app.Garage;

public class GarageRunner {

	public static void main(String[] args) {

		Garage garage=new Garage();
		garage.washing();
		
		Garage garage1=new Garage();
		garage1.removingDents();
	}

}
