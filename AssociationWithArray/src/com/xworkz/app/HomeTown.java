package com.xworkz.app;

import java.awt.geom.Area;

public class HomeTown {

	public String name;
	public int pinCode;
	public Area[] areas;
	public HomeTown(String name,int pinCode, Area[] areas) {
		this.name=name;
		this.pinCode=pinCode;
		this.areas=areas;
	}
	public void printInfo() {
		System.out.println("name is :"+name);
		System.out.println("pincode is :"+pinCode);
		for(int index=pinCode; index<areas.length; index++) {
			Area ref=areas[index];
		}
	}
}
