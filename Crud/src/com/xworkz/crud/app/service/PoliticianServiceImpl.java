package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PoliticianRepository;

public class PoliticianServiceImpl implements PoliticianService {

	private PoliticianRepository politicianRepository;

	public PoliticianServiceImpl(PoliticianRepository politicianRepository) {
		this.politicianRepository = politicianRepository;
	}

	@Override
	public boolean validateExperience(String name) {
		System.out.println("invoking validateExperience from " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Politician data is valid");
			this.politicianRepository.experience(name);
		} else {
			System.out.println("Politician data invalid");
		}
		return false;
	}

}
