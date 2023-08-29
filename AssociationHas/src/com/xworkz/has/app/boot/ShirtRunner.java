package com.xworkz.has.app.boot;

import com.xworkz.has.app.Button;
import com.xworkz.has.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ShirtRunner");

		String brand = "puma";
		Button button = new Button();

		Shirt shirt = new Shirt(brand);
		shirt.setButton(button);
		shirt.coveringBody();
	}

}
