package com.xworkz.equals.app;

public class Cook {
	private String name;
	private String location;
	private int age;
	private String ratings;
	private String type;
	private float cookingPrice;

	public Cook() {

	}

	public Cook(String name, String location, int age, String star, String type, float cookingPrice) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
		this.ratings = star;
		this.type = type;
		this.cookingPrice = cookingPrice;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Cook) {
				System.out.println("object is a Cook...");
				Cook casted = (Cook) obj;
				if (casted.name.equals(name) && casted.location.equals(location) && casted.age == this.age
						&& casted.ratings.equals(ratings)) {
					System.out.println("Given CEO name location age and ratingd" + "s is correct");
				} else {
					System.out.println("Given CEO name location age and ratings is not correct");

				}
			} else {
				System.out.println("object is not a CEO...");
			}
		} else {
			System.out.println("object is  null");
		}
		return true;
	}
}
