package com.xworkz.methods.boot;

import com.xworkz.methods.app.Stapler;

public class StaplerRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in Stapler");
		
		Stapler stapler=new Stapler();
		stapler.joingPapersTogether();
		stapler.joingPapersTogether(2210);
		stapler.joingPapersTogether("MAX USA CORP");
		stapler.joingPapersTogether(1821, "Swingline");
	}

}
