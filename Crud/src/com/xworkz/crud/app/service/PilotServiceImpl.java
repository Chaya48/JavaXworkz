package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PilotRepository;

public class PilotServiceImpl implements PilotService {

	private PilotRepository pilotRepository;

	public PilotServiceImpl(PilotRepository pilotRepository) {
		this.pilotRepository = pilotRepository;
	}

	@Override
	public void validateAndSave(String pilot) {

		System.out.println("invoking validateNavigation from " + this.getClass().getSimpleName());
		if (pilot != null && !pilot.isEmpty() && pilot.length() >= 3 && pilot.length() <= 20) {
			System.out.println("Pilot data is valid");
			this.pilotRepository.transpotingPassengers(pilot);
		} else {
			System.out.println("Pilot data invalid");
		}
	}
}
