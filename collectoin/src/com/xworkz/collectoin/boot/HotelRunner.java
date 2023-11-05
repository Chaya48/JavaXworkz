package com.xworkz.collectoin.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectoin.app.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {

		HotelDTO dto = new HotelDTO(1, "The Taj Mahal Palace", "Jamsetji Tata", "29AALFT6940M1ZC", "India");
		HotelDTO dto2 = new HotelDTO(2, "JW Marriott Hotel ", "Marriott International", "29AABCM0274G1ZL", "India");
		HotelDTO dto3 = new HotelDTO(3, "The Leela Palace", " William Mackenzie", "29AAACH3167J1ZE", "India");
		HotelDTO dto4 = new HotelDTO(4, "Hotel Riu", "Riu family", "07AJJPK7264J2ZR ", "Srilanka");
		HotelDTO dto5 = new HotelDTO(5, "Taj Samudra", "G.Sanjeevi ", "07AAACT3957G1Z9", "Srilanka");
		HotelDTO dto6 = new HotelDTO(6, "Hilton", "Christopher J.Nassetta", "06AAECH6769G1ZB", "Srilanka");
		HotelDTO dto7 = new HotelDTO(7, "The Langham", "Lucas Brothers", "07AABCL4742N1Z8", "USA");
		HotelDTO dto8 = new HotelDTO(8, "Post Ranch Inn", "Mike Freed", "PH MRYPRI", "USA");
		HotelDTO dto9 = new HotelDTO(9, "The Milestone Hotel", "John Freeman-Mitford", "24AAGFH9085A1ZI", "UK");
		HotelDTO dto10 = new HotelDTO(10, "The Kensington Hotel", "Peter", "33AACCV1087F1ZJ", "UK");

		Collection<HotelDTO> hotelCollection = new ArrayList<HotelDTO>();
		hotelCollection.add(dto);
		hotelCollection.add(dto2);
		hotelCollection.add(dto3);
		hotelCollection.add(dto4);
		hotelCollection.add(dto5);
		hotelCollection.add(dto6);
		hotelCollection.add(dto7);
		hotelCollection.add(dto8);
		hotelCollection.add(dto9);
		hotelCollection.add(dto10);

		System.out.println("Total :" + hotelCollection.size());

		hotelCollection.stream().filter(hotel -> hotel.getLoccation().equals("India")).map(hot -> hot.getName())
				.forEach(hotel -> System.out.println("Find all hotels in India :" + hotel));
		System.out.println();
		hotelCollection.stream().filter(hotel -> hotel.getLoccation().equals("Srilanka")).map(hot -> hot.getName())
				.forEach(hotel -> System.out.println("Find all hotels in Srilanka:" + hotel));
		System.out.println();
		hotelCollection.stream().forEach(hotel -> System.out.println("Only Owner Name :" + hotel.getOwnerName()));
		System.out.println();
		hotelCollection.stream().forEach(hotel -> System.out.println("only GST NO :" + hotel.getGst()));
		System.out.println();
		hotelCollection.stream().filter(hotel -> hotel.getLoccation().equals("UK")).map(hot -> hot.getId())
				.forEach(hotel -> System.out.println("Location is Uk :" + hotel));
		System.out.println();
		hotelCollection.stream().filter(hotel -> hotel.getLoccation().equals("USA")).map(hot -> hot.getOwnerName())
				.forEach(hotel -> System.out.println("Location is USA :" + hotel));

	}

}
