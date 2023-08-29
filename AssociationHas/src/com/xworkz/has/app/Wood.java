package com.xworkz.has.app;

public class Wood {
	private String type;
	private Paper paper;

	public Wood(String type) {
		this.type = type;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void carpentry() {
		System.out.println("invoking carpentry in wood");
		this.paper.write();
	}
}
