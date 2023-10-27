package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cities {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList();
		collection.add("Hassan");
		collection.add("Bengaluru");
		collection.add("Mysuru ");
		collection.add("Hubballi ");
		collection.add("Mangaluru ");
		collection.add("Belagavi ");
		collection.add("Ballari");
		collection.add("Vijayapura ");
		collection.add("Shivamogga ");
		collection.add("Tumakuru ");
		collection.add("Davanagere");
		collection.add("Kalaburagi ");
		collection.add("Udupi");
		collection.add("Raichur");
		collection.add("Dharwad");
		collection.add("Bidar");
		collection.add("Bagalkot");
		collection.add("Haveri");
		collection.add("Chitradurga");
		collection.add("Kolar");
		System.out.println("Total cites " + collection.size());

		Iterator<String> itra = collection.iterator();
		while (itra.hasNext()) {
			String cities = itra.next();
			System.out.println("City name is :" + cities);
		}
	}

}
