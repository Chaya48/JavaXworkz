package com.xworkz.equals.boot;

import com.xworkz.equals.app.Mechanic;

public class MechanicRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Mechanic Runner");
		Mechanic mechanic = new Mechanic("suresh", "bangalore", 45, "Washing", "car wash", 650f);
		Mechanic mechanic2 = new Mechanic("suresh", "bangalore", 45, "fgh", "car", 650f);
		boolean ref = mechanic.equals(mechanic2);
	}

}
