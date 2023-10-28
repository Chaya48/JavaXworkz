package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tools {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();
		collection.add("Plier");
		collection.add("Spanner");
		collection.add("Hammer");
		collection.add("Saw");
		collection.add("Screw Driver");
		collection.add("Jack");
		collection.add("Cutter");
		Iterator<String> itra = collection.iterator();
		while (itra.hasNext()) {
			String tools = itra.next();
			System.out.println("tools is " + tools);
		}
		

		Collection<String> collection2 = new ArrayList();
		collection2.add("Flash Light");
		collection2.add("Wrench");

		collection.addAll(collection2);
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String tool = itr.next();
			System.out.println("after add All " + tool);
		}
		boolean contains = collection.contains("saw");
		System.out.println("contain Saw :" + contains);
		boolean contains2 = collection.contains("Cutter");
		System.out.println("contains cutter :" + contains2);

		boolean cot = collection.containsAll(collection2);
		System.out.println("contains All :" + cot);

		boolean remove=collection.removeAll(collection2);
		System.out.println(remove);
		
			}

}
