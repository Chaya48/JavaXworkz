package com.xworkz.app.clas;

import com.xworkz.app.intr.RoomRule;
import com.xworkz.app.intr.RoomSafe;
import com.xworkz.app.intr.RoomSale;

public class RoomRoyal implements RoomRule, RoomSafe, RoomSale {

	@Override
	public int totalRooms() {
		System.out.println("invoking totalRooms in Royal");
		return 0;
	}

	@Override
	public boolean electricity() {
		System.out.println("invoking electricity in Royal");
		return false;
	}

}
