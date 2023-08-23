package com.xworkz.app.clas;

import com.xworkz.app.intf.TempleRules;

public class Devotees implements TempleRules {

	@Override
	public String queue(String line) {
System.out.println("invoking queue in devotees");
		return null;
	}

	@Override
	public boolean dressCode(String ethnicwere) {
System.out.println("invoking dresscode in devotees");
		return false;
	}

	@Override
	public void silence(String maintenance) {
System.out.println("invoking silence in devotees");
	}

}
