package com.xworkz.app.boot;

import com.xworkz.app.clas.RoomRoyal;
import com.xworkz.app.intr.RoomRule;
import com.xworkz.app.intr.RoomSafe;
import com.xworkz.app.intr.RoomSale;

public class RoomRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in Room");
		
		RoomSale sale=new RoomRoyal();
		sale.totalRooms();
		RoomRule sale1=new RoomRoyal();
		sale1.electricity();
		RoomSafe sale2=new RoomRoyal();
		sale2.electricity();
		sale2.totalRooms();
		RoomRoyal sale3=new RoomRoyal();
		sale3.electricity();
	}

}
