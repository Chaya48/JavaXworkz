package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {

		Collection<Long> collection = new ArrayList();
		collection.add(9353773818l);
		collection.add(9353773811l);
		collection.add(9353773812l);
		collection.add(9353773813l);
		collection.add(9353773814l);
		collection.add(9353773815l);
		collection.add(9353773816l);
		collection.add(9353773817l);
		collection.add(9353773821l);
		collection.add(9353773838l);
		collection.add(9353773848l);
		collection.add(9353773858l);
		collection.add(9353773868l);
		collection.add(9353773878l);
		collection.add(9353773888l);
		collection.add(9353773898l);
		collection.add(9353773118l);
		collection.add(9353773218l);
		collection.add(9353773318l);
		collection.add(9353773418l);
		collection.add(9353773518l);
		collection.add(9353773618l);
		collection.add(9353773718l);
		collection.add(9353773918l);
		collection.add(9353773018l); 
		
		collection.add(9353777118l);
		collection.add(9353772818l);
		collection.add(9353774818l);
		collection.add(9353775818l);
		collection.add(9353776818l);
		collection.add(9353777818l);
		System.out.println("Total Numbers is " + collection.size());
		Iterator<Long> itra = collection.iterator();
		while (itra.hasNext()) {
			Long mobile = itra.next();
			System.out.println("Mobile number is " + mobile);
		}
	}

}
