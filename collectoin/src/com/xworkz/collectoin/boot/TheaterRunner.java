package com.xworkz.collectoin.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectoin.app.dto.TheaterDTO;

public class TheaterRunner {

	public static void main(String[] args) {

		TheaterDTO dto=new TheaterDTO("Bhanu", 150, "Mandya", false);
		TheaterDTO dto2=new TheaterDTO("Channambika", 200, "Holenarasipura", true);
		TheaterDTO dto3=new TheaterDTO("Nalanda", 100, "Mysuru", true);
		TheaterDTO dto4=new TheaterDTO("Prassanna", 350, "Bengaluru", true);
		TheaterDTO dto5=new TheaterDTO("SBG", 400, "Hassan", true);
		
		Collection<TheaterDTO> theater=new ArrayList<TheaterDTO>();
		theater.add(dto);
		theater.add(dto2);
		theater.add(dto3);
		theater.add(dto4);
		theater.add(dto5);
		
		for (TheaterDTO theaterDTO : theater) {
			System.out.println(theaterDTO);
		}
		System.out.println();
		theater.stream().sorted().forEach(t ->System.out.println(t));
	}

}
