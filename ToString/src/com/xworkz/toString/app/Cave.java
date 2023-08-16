package com.xworkz.toString.app;

public class Cave {

	private String name;
	private String location;
	private String geologicalFormation;
	private String caveSystemCount;
	private double depth;
	private double temperature;
	private int stalactiteCount;
	private int batPopulation;
	private boolean isOpenAlways;
	private boolean explorationStatus;

	public Cave() {
		System.out.println("invoking no-args constructor in cave");
	}

	public Cave(String name, String location, String geologicalFormation, String caveSystemCount, double depth,
			double temperature, int stalactiteCount, int batPopulation, boolean isOpenAlways,
			boolean explorationStatus) {
		super();
		this.name = name;
		this.location = location;
		this.geologicalFormation = geologicalFormation;
		this.caveSystemCount = caveSystemCount;
		this.depth = depth;
		this.temperature = temperature;
		this.stalactiteCount = stalactiteCount;
		this.batPopulation = batPopulation;
		this.isOpenAlways = isOpenAlways;
		this.explorationStatus = explorationStatus;
	}

	@Override
	public String toString() {
		return "name :" + this.name +"\n "+"location :" + this.location + "\n"+"geological Formation :" + this.geologicalFormation
				+"\n"+ "caveSystemCount :" + this.caveSystemCount + "\n"+"depth :" + this.depth + "\n"+"temperature :"
				+ this.temperature + "\n"+"stalactiteCount :" + this.stalactiteCount + "\n"+"batPopulation :" + this.batPopulation
				+"\n"+ "isOpenAlways :" + this.isOpenAlways + "\n"+"explorationStatus :" + this.explorationStatus;
	}
}
