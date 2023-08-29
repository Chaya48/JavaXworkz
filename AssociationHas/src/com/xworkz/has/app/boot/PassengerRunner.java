package com.xworkz.has.app.boot;

import com.xworkz.has.app.Bus;
import com.xworkz.has.app.Passenger;

public class PassengerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PassengerRunner");
		
		String name="chaya";
		Bus bus=new Bus();
		
		Passenger passenger=new  Passenger(name);
		passenger.setBus(bus);
		passenger.travel();
		
	}

}
