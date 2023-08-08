package com.xworkz.overRide.app;

public class AirlineTicket extends Ticket {
	public AirlineTicket() {
		System.out.println("invoking no-args in Ticket");
	}

	@Override
	public void booking() {
		System.out.println("invoking booking in Airline Ticket");
	}
}
