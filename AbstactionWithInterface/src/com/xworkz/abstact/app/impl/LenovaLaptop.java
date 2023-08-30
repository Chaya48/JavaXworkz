package com.xworkz.abstact.app.impl;

import com.xworkz.abstact.app.Processor;

public class LenovaLaptop implements Processor {
	@Override
	public void fetch() {
		System.out.println("invoking fetch in lenovaLaptop");
	}

}
