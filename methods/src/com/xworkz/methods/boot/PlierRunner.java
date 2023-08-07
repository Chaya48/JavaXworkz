package com.xworkz.methods.boot;

import com.xworkz.methods.app.Plier;

public class PlierRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in plierRunner");
		
		Plier plier=new Plier();
		plier.cutting();
		plier.cutting(1.5f);
		plier.cutting("Black");
		plier.cutting(3.5f, "Blue");
	}

}
