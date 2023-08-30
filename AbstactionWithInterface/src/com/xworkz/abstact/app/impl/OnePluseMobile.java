package com.xworkz.abstact.app.impl;

import com.xworkz.abstact.app.Camara;

public class OnePluseMobile implements Camara {

	@Override
	public void capture() {
		System.out.println("invoking capture in onepluseMobile");
	}

}
