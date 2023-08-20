package com.xworkz.equals.boot;

import com.xworkz.equals.app.Thief;

public class ThiefRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in Thief runner");
		Thief thief = new Thief("anusha", "rajaji nagar", 22, "Glod", "NightTimethief", "police");
		Thief thief2 = new Thief("anusha", "rajaji nagar", 22, "Glod", "NightTimethief", "police");
		boolean ref = thief.equals(thief2);
	}

}
