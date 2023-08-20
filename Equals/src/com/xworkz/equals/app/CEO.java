package com.xworkz.equals.app;

public class CEO {
	private String name;
	private String companyName;
	private int age;
	private String qualification;
	private String companyLocation;
	private double companyProfit;

	public CEO() {

	}

	public CEO(String name, String companyName, int age, String qualification, String companyLocation,
			double companyProfit) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.age = age;
		this.qualification = qualification;
		this.companyLocation = companyLocation;
		this.companyProfit = companyProfit;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof CEO) {
				System.out.println("object is a CEO...");
			} else {
				System.out.println("object is not a CEO...");
			}
			CEO casted = (CEO) obj;
			if (casted.name.equals(name) && casted.companyName.equals(companyName)) {
				System.out.println("CEO name is same");
				System.out.println("companyName name is same");

			} else {
				System.out.println("CEO name is not same");
				System.out.println("companyName name is not same");

			}
		} else {
			System.out.println("Object is null");
		}
		return true;
	}
}
