package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Power;
import com.xworkz.abstact.app.Telivision;
import com.xworkz.abstact.app.impl.LgTelivision;
import com.xworkz.abstact.app.impl.MiTelivision;

public class TelivionRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Telivision Runner");
		Power power = new LgTelivision();
		Power power2 = new MiTelivision();

		Telivision telivision = new Telivision();
		telivision.setPower(power);
		telivision.turnOn();
	}

}
