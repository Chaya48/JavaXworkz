package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.ArtistRepository;

public class ArtistServiceImpl implements ArtistService {

	private ArtistRepository artistRepository;

	public ArtistServiceImpl(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}

	@Override
	public void validateAndSave(String artist) {
		System.out.println("invoking validateAndSave from " + this.getClass().getSimpleName());
		if (artist != null && !artist.isEmpty() && artist.length() >= 3 && artist.length() <= 20) {
			System.out.println("Artist data is valid");
			this.artistRepository.performance(artist);
		} else {
			System.out.println("Artist data invalid");
		}

	}

}
