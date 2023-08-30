package com.xworkz.abstact.app.impl;

import com.xworkz.abstact.app.Power;

public class LgTelivision implements Power {

	@Override
	public void turnOn() {
		System.out.println("invoking turnOn in lgTelivision");
	}

}
