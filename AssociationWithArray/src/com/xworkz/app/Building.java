package com.xworkz.app;

public class Building {

	public Floor[] floors;
	public Lift[] lifts;
	public Building(Floor[] floors, Lift[] lifts) {
		this.floors=floors;
		this.lifts=lifts;
	}
	public void printInfo() {
		for(int index=0; index<floors.length; index++) {
			Floor ref=floors[index];
			ref.printInfo();
		}
	}
}
