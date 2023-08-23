package com.xworkz.app.clas;

import com.xworkz.app.intf.EngineeringRules;

public class Students implements EngineeringRules {

	@Override
	public void attendence(String branch) {
System.out.println("invoking attendence in student");
	}

	@Override
	public int avgMarks(int avgInternalMarks) {
		System.out.println("invoking avgMarks in student");
		return 35;
	}

	@Override
	public boolean regular(String id) {
		System.out.println("invoking regular in student");
		return false;
	}

}
