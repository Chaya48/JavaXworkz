package com.xworkz.equals.app;

public class Thief {
	private String name;
	private String locationOfThief;
	private int age;
	private String Steals;
	private String type;
	private String police;

	public Thief() {

	}

	public Thief(String name, String locationOfThief, int age, String steals, String type, String police) {
		super();
		this.name = name;
		this.locationOfThief = locationOfThief;
		this.age = age;
		Steals = steals;
		this.type = type;
		this.police = police;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Thief) {
				System.out.println("object is a Cook...");
				Thief casted = (Thief) obj;
				if (casted.name.equals(name) && casted.locationOfThief.equals(locationOfThief) && casted.age == this.age
						&& casted.type.equals(type) && casted.Steals.equals(Steals) && casted.type.equals(type)
						&& casted.police.equals(police)) {
					System.out.println("Given Thief name location age steals and police type  is correct");
				} else {
					System.out.println("Given Thief name location age steals and police type not is correct");

				}
			} else {
				System.out.println("object is not a Thief...");
			}
		} else {
			System.out.println("object is  null");
		}
		return true;
	}
}
