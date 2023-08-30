package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Camara;
import com.xworkz.abstact.app.Mobile;
import com.xworkz.abstact.app.impl.OnePluseMobile;
import com.xworkz.abstact.app.impl.OppoMobile;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in mobileRunner");

		Camara camara = new OnePluseMobile();
		Camara camara2 = new OppoMobile();

		Mobile mobile = new Mobile();
		mobile.setCamara(camara);
		mobile.capture();
	}

}
