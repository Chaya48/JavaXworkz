package com.xworkz.has.app.boot;

import com.xworkz.has.app.Paper;
import com.xworkz.has.app.Wood;

public class WoodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in WoodRunner");

		String type = "teak";
		Paper paper = new Paper();

		Wood wood = new Wood(type);
		wood.setPaper(paper);
		wood.carpentry();
	}

}
