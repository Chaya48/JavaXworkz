package com.xworkz.collectoin.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collectoin.app.dto.ApplicationDTO;

public class Runner {

	public static void main(String[] args) {

		
		ApplicationDTO dto=new ApplicationDTO("whatsApp", "1.8", "whatsapp", LocalDate.of(2009, 02, 10), 5);
		ApplicationDTO dto2=new ApplicationDTO("facebook", "1.7", "facebook", LocalDate.of(2023, 11, 12), 4.5);
		ApplicationDTO dto3=new ApplicationDTO("Instgram", "1.9", "Instagram", LocalDate.of(2021, 12, 13), 4.4);
		ApplicationDTO dto4=new ApplicationDTO("LinkedIn", "1.6", "LinkedIn", LocalDate.of(2020, 10, 14), 4.3);
		ApplicationDTO dto5=new ApplicationDTO("Amazon", "1.5", "Amazon", LocalDate.of(2019, 9, 19), 4.2);
		
		Collection<ApplicationDTO> collection=new ArrayList();
		collection.add(dto);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		Iterator<ApplicationDTO> itra=collection.iterator();
		while(itra.hasNext())
		{
		ApplicationDTO applicationDTO=itra.next();
		System.out.println(applicationDTO.getName());
		}

		
	}
	

}
