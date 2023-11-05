package com.xworkz.app;

public class Players {

	public Floor[] floors;
	public Lift[] lifts;
	public void Building(Floor[] floors, Lift[] lifts) {
		this.floors=floors;
		this.lifts=lifts;
	}
	public void printInfo() {
		for(int index=0; index<floors.length; index++) {
			Floor ref=floors[index];
			ref.printInfo();
		}
		for(int index=0; index<lifts.length; index++) {
			Lift ref=lifts[index];
			ref.printInfo();
		}
	}
}
