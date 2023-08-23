package com.xworkz.app.boot;

import com.xworkz.app.clas.Girls;
import com.xworkz.app.intf.PGRules;

public class PGRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PG Runner");
		PGRules pg=new Girls();
		pg.payment("5000");
		pg.noFoodWeast(500);
		pg.timings(10);

	}

}
