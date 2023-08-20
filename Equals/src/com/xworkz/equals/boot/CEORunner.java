package com.xworkz.equals.boot;

import com.xworkz.equals.app.CEO;

public class CEORunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in CEO Runner");
		CEO ceo = new CEO("Om", "Xworkz", 54, "B.E", "bangalore", 345677);
		CEO ceo2 = new CEO("Om", "Xworkz", 54, "B.E", "bangalore", 345677);
		boolean ref = ceo.equals(ceo2);
		System.out.println("CEO name is same: " + ref);
	}

}
