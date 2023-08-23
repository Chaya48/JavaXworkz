package com.xworkz.app.clas;

import com.xworkz.app.intf.MetroRules;

public class Public implements MetroRules{

	@Override
	public void noSmoking(String security) {
System.out.println("invoking noSmoking in public");
	}

	@Override
	public double price(String coins) {
System.out.println("invoking price in public");
return 10.00;
	}

	@Override
	public String ticket(String card) {
System.out.println("invoking ticket in public");
return null;
	}

}
