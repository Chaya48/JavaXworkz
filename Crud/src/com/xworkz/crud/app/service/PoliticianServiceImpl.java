package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PoliticianRepository;

public class PoliticianServiceImpl implements PoliticianService {

	private PoliticianRepository politicianRepository;

	public PoliticianServiceImpl(PoliticianRepository politicianRepository) {
		this.politicianRepository = politicianRepository;
	}

	@Override
	public boolean validateAndSave(String politician) {
		System.out.println("invoking validateExperience from " + this.getClass().getSimpleName());
		if (politician != null && !politician.isEmpty() && politician.length() >= 3 && politician.length() <= 20) {
			System.out.println("Politician data is valid");
			this.politicianRepository.socialization(politician);
		} else {
			System.out.println("Politician data invalid");
		}
		return false;
	}

}
