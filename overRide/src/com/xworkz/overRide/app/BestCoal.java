package com.xworkz.overRide.app;

public class BestCoal extends Coal {
	public BestCoal() {
		System.out.println("invoking no-args  in bestCoal");
	}

	@Override
	public void burn() {
		System.out.println("invoking burn in Bestcoal");
	}
}
