package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.ArtistRepository;
import com.xworkz.crud.app.repository.ArtistRepositoryImpl;

public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ArtistRunner");
		
		ArtistRepository artist=new ArtistRepositoryImpl();
		artist.performance("punith RajKumar");
		artist.performance("sudeep");
		artist.performance("darshan");
		artist.performance("radhika");
		artist.performance("rachita");
		artist.performance("malashree");
		artist.performance("vishnuvardan");
		artist.performance("shivarajkumar");
		artist.performance("rajkumar");
		artist.performance("bhavana");
		artist.performance("ravichandran");
		
	}

}
