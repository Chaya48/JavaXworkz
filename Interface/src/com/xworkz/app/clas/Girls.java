package com.xworkz.app.clas;

import com.xworkz.app.intf.PGRules;

public class Girls implements PGRules {

	@Override
	public int timings(int time) {
System.out.println("invoking timings in girls");
		return 0;
	}

	@Override
	public void payment(String advance) {
		System.out.println("invoking payment in girls");

	}

	@Override
	public float noFoodWeast(float paid) {
		System.out.println("invoking noFoodWeast in girls");
		return 5500;
	}

}
