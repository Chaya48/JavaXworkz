package com.xworkz.app.clas;

import com.xworkz.app.intf.MilitaryRules;

public class Soldiers implements MilitaryRules {

	@Override
	public void ageLimit(int minAge) {
System.out.println("invoking ageLimit in Soldiers");
	}

	@Override
	public double height(double minHeight) {
System.out.println("invoking height in Soldiers");
return 5.5;
	}

	@Override
	public int weight(int minWeight) {
System.out.println("invoking weight in soldiers");
		return 60;
	}

}
