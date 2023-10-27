package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class River {
	// for each,for each method, iterator,stream
	// iterator -3 methods hashnext,next,remove
	// hashnext - check the next element is their or not, retrun type is boolean
	// next -print the ref

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList();
		collection.add("kaveri");
		collection.add("hemavathi");
		collection.add("thunga");
		collection.add("netravathi");
		collection.add("ganga");
		System.out.println("Total rivers Names " + collection.size());

		Iterator<String> itr = collection.iterator();// create the iterator
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("River names is " + name);
		}
		System.out.println("=============================");
		collection.remove("kaveri");
		Iterator<String> itra = collection.iterator();
		while (itra.hasNext()) {
			String names = itra.next();
			System.out.println(" after remove  " + names);
		}
		System.out.println("===================");
		Collection<String> collection3 = new ArrayList();
		collection3.add("Tungabhadra");
		collection3.add("Bhima ");
		collection3.add("Malaprabha");
		collection3.add("Ghataprabha");
		collection3.add("Sharavathi");

		collection.addAll(collection3);
		Iterator<String> itra1 = collection3.iterator();
		while (itra1.hasNext()) {
			String riv = itra1.next();
			System.out.println("after add all  " + riv);
		}
		System.out.println("====================");
		boolean c = collection.contains("ganga");
		Iterator<String> itra2 = collection.iterator();
		while (itra2.hasNext()) {
			String riv1 = itra2.next();
			System.out.println("after contains  " + c);
		}
		System.out.println("==================");

		Collection<String> collection1 = new ArrayList();
		collection1.add("Yamuna");
		collection1.add("Brahmaputra");
		collection1.add("Godavari");
		collection1.add("Krishna");
		collection1.add("Mahanadi");
		collection.containsAll(collection1);
		Iterator<String> itra3 = collection1.iterator();
		while (itra3.hasNext()) {
			String riv2 = itra3.next();
			System.out.println("after contains  all  " + riv2);
		}
		System.out.println("===============");

		Collection<String> collection2 = new ArrayList();
		collection2.add("Narmada");
		collection2.add("Tapti ");
		collection2.add("Sabarmati");
		collection2.add("Beas");
		collection2.add("Chenab");

		collection.removeAll(collection2);
		Iterator<String> itra4 = collection2.iterator();
		while (itra4.hasNext()) {
			String riv3 = itra4.next();
			System.out.println("after remove  all  " + riv3);
		}

		System.out.println("=============");
		collection.clear();

		System.out.println("==============");
		collection.isEmpty();
	}

}
