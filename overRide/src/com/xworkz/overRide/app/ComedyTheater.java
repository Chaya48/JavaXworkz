package com.xworkz.overRide.app;

public class ComedyTheater extends Theater {
	public ComedyTheater() {
		System.out.println("invoking no-args in Comedy Theater");
	}

	@Override
	public void entertainment() {
		System.out.println("invoking entertainment in ComedyTheater");
	}
}
