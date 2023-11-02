package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamRunner {

	public static void main(String[] args) {

		Collection<String> roleCollection = new ArrayList<String>();
		roleCollection.add("Software Engineer");
		roleCollection.add("Electrical Engineer");
		roleCollection.add("Data Engineer");
		roleCollection.add("Automation Tester");
		roleCollection.add("performance Tester");
		roleCollection.add("HR");
		roleCollection.add("Manager");
		roleCollection.add("Business Analyst");
		roleCollection.add("Java Developer");
		roleCollection.add("web Developer");

		for (String role : roleCollection) {
			if (role.endsWith("Tester")) {
				System.out.println(role);
			}
		}
		System.out.println("--------------------------------------");
		roleCollection.stream().filter((role) -> role.endsWith("Tester")).forEach(r -> System.out.println(r));
		roleCollection.stream().filter(r -> !r.contains("m")).forEach(r ->System.out.println(r));
		System.out.println("--------------------------------------");
		

		List<String> roleWithMlist=roleCollection.stream().filter(r ->r.contains("m")).collect(Collectors.toList());
	System.out.println(roleWithMlist);
}
}