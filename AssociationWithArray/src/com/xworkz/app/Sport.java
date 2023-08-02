package com.xworkz.app;

public class Sport {

	public String name;
	public Players[] players;
	public Sport(String name,Players[] players) {
		this.name=name;
		this.players=players;
	}
	public void printInfo() {
		System.out.println("name of the sports "+this.name);
		for(int index=0; index<this.players.length; index++) {
			Players ref=players[index];
			ref.printInfo();
		}
	}
}
