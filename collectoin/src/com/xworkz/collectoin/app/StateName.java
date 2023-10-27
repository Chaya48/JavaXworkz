package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StateName {

	public static void main(String[] args) {

		Collection<String> collection=new ArrayList();
		collection.add("Karnataka");
		collection.add("AndhraPradesh");
		collection.add("Assam ");
		collection.add("Arunachal Pradesh");
		collection.add("Bihar");
		collection.add("Chhattisgarh");
		collection.add("Goa");
		collection.add("Gujarat");
		collection.add("Haryana");
		collection.add("HimachalPradesh");
		collection.add("Jharkhand");
		collection.add("Kerala");
		collection.add("MadhyaPradesh");
		collection.add("Maharashtra ");
		collection.add("Manipur");
		collection.add("Meghalaya");
		collection.add("Mizoram");
		collection.add("Nagaland");
		collection.add("Odisha");
		collection.add("Punjab");
		collection.add("Rajasthan");
		collection.add("Sikkim");
		collection.add("TamilNadu");
		collection.add("Telangana");
		collection.add("Tripura");
		collection.add("UttarPradesh ");
		collection.add("Uttarakhand ");
		collection.add("WestBengal ");
		collection.add("JammiKashmir");
		System.out.println("Total state is "+collection.size());
		
		
		Iterator<String> itra=collection.iterator();
		while(itra.hasNext()) {
			String states=itra.next();
			System.out.println("State name is :"+states);
		}
	}

}
