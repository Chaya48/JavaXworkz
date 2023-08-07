package com.xworkz.methods.boot;

import com.xworkz.methods.app.Elevator;

public class ElevatorRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in ElevatorRunner");
		
		Elevator elevator=new Elevator();
		elevator.transport();
		elevator.transport(30f);
		elevator.transport(40);
		elevator.transport(25f, 30);
	}

}
