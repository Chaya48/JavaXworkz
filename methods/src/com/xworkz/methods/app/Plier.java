package com.xworkz.methods.app;

public class Plier {

	public float weight;
	public String color;
	
	public void cutting() {
	      System.out.println("invoking no-arg in Plier");
	      System.out.println("plier weight is :"+weight);
	      System.out.println("plier color is :"+color);
	      cutting(weight);
	      cutting(color);
	}
	public void cutting(float weight) {
		  System.out.println("invoking float parameter in Plier");
	      System.out.println("plier weight is :"+weight);
	}
	public void cutting(String color) {
		 System.out.println("invoking String parameter in Plier");
		 System.out.println("plier color is :"+color);
	}
	public void cutting(float weight,String color) {
		 System.out.println("invoking float,String parameter in Plier");
		 System.out.println("plier weight is :"+weight);
		 System.out.println("plier color is :"+color);
		 cutting(2.5f);
		 cutting("Red");
	}
}
