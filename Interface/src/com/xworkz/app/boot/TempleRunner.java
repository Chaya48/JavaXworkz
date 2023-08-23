package com.xworkz.app.boot;

import com.xworkz.app.clas.Devotees;
import com.xworkz.app.intf.TempleRules;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Temple runner");
		TempleRules temple=new Devotees();
		temple.queue("for darshana");
		temple.silence("must be silens");
		temple.dressCode("ethnicwere");
		
	}

}
