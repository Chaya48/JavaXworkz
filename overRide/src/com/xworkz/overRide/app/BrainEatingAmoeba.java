package com.xworkz.overRide.app;

public class BrainEatingAmoeba extends Amoeba {
	public BrainEatingAmoeba() {
		System.out.println("invoking no-args in brainEatingAmoeba");
	}

	@Override
	public void movementOfCells() {
		System.out.println("invoking movement of cells in brainEatingAmoeba");
	}

}
