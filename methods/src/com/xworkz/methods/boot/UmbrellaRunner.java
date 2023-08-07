package com.xworkz.methods.boot;

import com.xworkz.methods.app.Umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in UmbrellaRunner");
		
		Umbrella umbrella=new Umbrella();
		umbrella.protectFromRain();
		umbrella.protectFromRain(400);
		umbrella.protectFromRain(1);
		umbrella.protectFromRain(900, 2);
	}

}
