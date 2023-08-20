package com.xworkz.equals.app;

public class Sniper {
	private String sniperType;
	private float range;
	private int noOfShots;
	private String training;
	private int veriety;
	private String spotter;

	public Sniper() {

	}

	public Sniper(String sniperType, float range, int noOfShots, String training, int veriety, String spotter) {
		super();
		this.sniperType = sniperType;
		this.range = range;
		this.noOfShots = noOfShots;
		this.training = training;
		this.veriety = veriety;
		this.spotter = spotter;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not a null");
			if (obj instanceof Sniper) {
				System.out.println("Object given is correct");
				Sniper casted = (Sniper) obj;
				if (casted.sniperType.equals(sniperType) && casted.range == this.range
						&& casted.noOfShots == this.noOfShots) {
					System.out.println("Given sniperType range and noOfShots is correct");
				} else {
					System.out.println("Given sniperType range and noOfShots is not correct");
				}
			} else {
				System.out.println("Object given is not correct");
			}
		} else {
			System.err.println("Object is not a null");

		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
