package com.xworkz.equals.boot;

import com.xworkz.equals.app.Minister;

public class MinisterRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in minister Runner");
		Minister minister = new Minister("NarendraModhi");
		Minister minister2 = new Minister("NarendraModhi");
		boolean ref = minister.equals(minister2);
		System.out.println("Minister name is same: " + ref);
	}

}
