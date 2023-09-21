package com.xworkz.engDTO.app.util;

import java.util.Optional;

public class GarageUtil {

	public static Optional<String> getName(String fname,String lname){
		
		if(fname !=null && lname !=null) 
		{
			System.out.println("data is there ,,");
		     return Optional.of(fname+" "+lname);
			
		}
		return Optional.empty();
	}
}
