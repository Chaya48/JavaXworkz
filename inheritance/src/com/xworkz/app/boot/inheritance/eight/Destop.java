package com.xworkz.app.boot.inheritance.eight;

public class Destop extends ElectronicsDevice {
     public String brand="Dell";
     public Destop() {
    	 System.out.println("default constructor of destop");
     }
     public void destopMethod() {
    	 System.out.println("running the destop method");
    	 System.out.println("destop brand is :"+brand);
     }
}
