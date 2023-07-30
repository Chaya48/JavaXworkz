package com.xworkz.app;

public class Garage {

	public Mechanic mechanic=new Mechanic();
	public Mechanic mechanic1=new Mechanic();
	
	
	public void washing() {
		if(mechanic!=null) {
			this.mechanic.repair();
			System.out.println("invoking washing in garage");
		}
		else {
			System.out.println("invoking washing is null");
		}
	}
	
	public void removingDents() {
		if(mechanic1!=null) {
			this.mechanic1.troubleshoot();
			System.out.println("invoking removing dents in garage");
		}
		else {
			System.out.println("invoking removing dents is null");
		}
	}
}
