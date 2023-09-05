package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.ArtistRepository;
import com.xworkz.crud.app.repository.ArtistRepositoryImpl;
import com.xworkz.crud.app.service.ArtistService;
import com.xworkz.crud.app.service.ArtistServiceImpl;

public class ArtistServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ArtistServiceRunner");
		ArtistRepository artistRepository = new ArtistRepositoryImpl();
		ArtistService artistService = new ArtistServiceImpl(artistRepository);
		artistService.validateAndMovie("SSE");

	}

}
