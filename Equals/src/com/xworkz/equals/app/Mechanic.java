package com.xworkz.equals.app;

public class Mechanic {
	private String name;
	private String location;
	private int age;
	private String wash;
	private String type;
	private float repairPrice;

	public Mechanic() {

	}

	public Mechanic(String name, String location, int age, String wash, String type, float repairPrice) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
		this.wash = wash;
		this.type = type;
		this.repairPrice = repairPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Mechanic) {
				System.out.println("object is a Mechanic...");
				Mechanic casted = (Mechanic) obj;
				if (casted.name.equals(name) && casted.location.equals(location) && casted.age == this.age
						&& casted.wash.equals(wash)) {
					System.out.println("Given mechanic name location age and wash is correct");
				} else {
					System.out.println("Given mechanic name location age and wash is not correct");

				}
			} else {
				System.out.println("object is not a Mechanic...");
			}
		} else {
			System.out.println("object is  null");
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
