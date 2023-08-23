package com.xworkz.app.boot;

import com.xworkz.app.clas.Students;
import com.xworkz.app.intf.EngineeringRules;

public class EngineeringRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in engineering runner");
		EngineeringRules engineering=new Students();
		engineering.attendence("EEE");
		engineering.avgMarks(30);
		engineering.regular("StudentID");
	}

}
