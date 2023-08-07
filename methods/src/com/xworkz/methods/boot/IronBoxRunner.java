package com.xworkz.methods.boot;

import com.xworkz.methods.app.IronBox;

public class IronBoxRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in IronBox");
		
		IronBox iron=new IronBox();
		iron.removeWrinkles();
		iron.removeWrinkles(1500);
		iron.removeWrinkles("bajaj");
		iron.removeWrinkles(1700,"Philips");
	}

}
