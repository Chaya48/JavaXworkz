package com.xworkz.abstact.app;

public class Browser {

	private Internet internet;

	public void connect() {
		System.out.println("invoking connect in browser");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

}
