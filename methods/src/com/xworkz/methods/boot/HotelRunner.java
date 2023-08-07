package com.xworkz.methods.boot;

import com.xworkz.methods.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in hotelRunner");
		
		Hotel hotel=new Hotel();
		hotel.food();
		hotel.food("Bangluru");
		hotel.food(200);
		hotel.food("Mysuru", 250);
	}

}
