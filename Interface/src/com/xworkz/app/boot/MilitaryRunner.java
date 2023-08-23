package com.xworkz.app.boot;

import com.xworkz.app.clas.Soldiers;
import com.xworkz.app.intf.MilitaryRules;

public class MilitaryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Militory Runner");
		MilitaryRules militory=new Soldiers();
		militory.ageLimit(21);
		militory.height(6);
		militory.weight(70);
	}

}
