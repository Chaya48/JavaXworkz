package com.xworkz.collectoin.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collectoin.app.dto.SaloonDTO;

public class SaloonRunner {

	public static void main(String[] args) {

		SaloonDTO dto=new SaloonDTO(1, "Green Tends Unisex", 150, "facial", true);
		SaloonDTO dto2=new SaloonDTO(2, "Precision Beauty", 250, "massage", false);
		SaloonDTO dto3=new SaloonDTO(3, "Exponential Beauty", 350, "Hair removal", true);
		SaloonDTO dto4=new SaloonDTO(4, "Total Transformation", 450, "waxing", false);
		SaloonDTO dto5=new SaloonDTO(5, "Evolve Salon", 550, "threading", true);
		SaloonDTO dto6=new SaloonDTO(6, "Flawless Finish", 650, "tanning", false);
		SaloonDTO dto7=new SaloonDTO(7, "Just Beauty", 750, "nail art", true);
		SaloonDTO dto8=new SaloonDTO(8, "All in one Salon", 850, "manicures", false);
		SaloonDTO dto9=new SaloonDTO(9, "The style hub", 950, "pedicures", true);
		SaloonDTO dto10=new SaloonDTO(10, "Creative Cut Unisex salon", 1150, "cosmetology", false);
		
		Collection<SaloonDTO> saloon=new ArrayList<SaloonDTO>();
		saloon.add(dto);
		saloon.add(dto2);
		saloon.add(dto3);
		saloon.add(dto4);
		saloon.add(dto5);
		saloon.add(dto6);
		saloon.add(dto7);
		saloon.add(dto8);
		saloon.add(dto9);
		saloon.add(dto10);
		System.out.println("Total no of Saloon =" + saloon.size());
		
		
		Iterator<SaloonDTO> iterator=saloon.iterator();
		while(iterator.hasNext()) {
			SaloonDTO saloon1=iterator.next();
			System.out.println("Name :"+saloon1.getName());
		}
		
		Collection<SaloonDTO> saloon2=new ArrayList<SaloonDTO>();
		SaloonDTO dto11=new SaloonDTO(11,"Rejuvenate", 520,"Combo", true);
		SaloonDTO dto12=new SaloonDTO(12,"Zenesty", 800,"Washer", false);
		
		boolean containAll=saloon2.containsAll(saloon);
		System.out.println("After containsAll "+containAll);
		System.out.println();
		
		boolean contain=saloon.contains(dto11);
		System.out.println("after contains "+contain);
		System.out.println();
		
		Collection<SaloonDTO> saloon3 = new ArrayList<>();
		SaloonDTO dto13=new SaloonDTO(13,"Brow Baroque", 520,"Combo", true);
		SaloonDTO dto14=new SaloonDTO(14,"Endless Charm", 800,"Washer", false);
		
		boolean removeAll=saloon.removeAll(saloon3);
		System.out.println("after removeAll :"+removeAll);
		System.out.println();
		
		boolean remove=saloon.remove(dto14);
		System.out.println("after remove :"+remove);
		System.out.println();
}
}
