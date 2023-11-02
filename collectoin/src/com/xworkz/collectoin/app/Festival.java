package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Festival {
	
	public static void main(String[] args) {
	
	Collection<String> festival=new ArrayList<String>();
	festival.add("Diwali");
	festival.add("Navaratri");
	festival.add("Holi");
	festival.add("Krishna Janmashtami");
	festival.add("onam");
	festival.add("Ugadi");
	festival.add("Ganesha Chaturthi");
	festival.add("Pongal");
	festival.add("Ram Navami");
	festival.add("Hanuman Jayanti");
	festival.add("Akshaya Tritiya");
	festival.add("Makara Sankranti");
	festival.add("Bakrid");
	festival.add("Christmas");
	festival.add("Maha shivaratri");
	
	System.out.println("Total festival :"+festival.size());
	
	for (String festivalName : festival) {
		if(festivalName.length()>6) {
			System.out.println("Festival with more than 6 charater :"+festivalName);
		}
	}
	System.out.println();
	for (String festivalName : festival) {
		if(festivalName.length()<6) {
			System.out.println("Festival with less than 6 charater :"+festivalName);
		}
	}
	System.out.println();
     List<String> collectWithO=festival.stream().filter(r->r.contains("o")).collect(Collectors.toList());
     System.out.println("contaions O :"+collectWithO);
     
     System.out.println();
    List<String> collectWithG= festival.stream().filter(r->!r.contains("g")).collect(Collectors.toList());
     System.out.println("contaions G :"+collectWithG);
     
     System.out.println();
     List<String>  endWithS=festival.stream().filter(r->r.endsWith("s")).collect(Collectors.toList());
     System.out.println("End with S :"+endWithS);
     
     System.out.println();
     List<String> containWithR=festival.stream().filter(r->r.contains("R")).collect(Collectors.toList());
     System.out.println("contain with R :"+containWithR);
     
     System.out.println();
    List<String> containRam=festival.stream().filter(r->r.contains("Ram")).collect(Collectors.toList());
     System.out.println("contain Ram :"+containRam);
}
}