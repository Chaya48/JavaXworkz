package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.HistoricalPlacesRepository;

public class HistoricalPlaceServiceImpl implements HistoricalPlaceService {

	private HistoricalPlacesRepository historicalPlacesRepository;

	public HistoricalPlaceServiceImpl(HistoricalPlacesRepository historicalPlaceRepository) {
		this.historicalPlacesRepository = historicalPlaceRepository;
	}

	@Override
	public boolean validateAndSave(String places) {
		System.out.println("invoking validateHistory from " + this.getClass().getSimpleName());
		if (places != null && !places.isEmpty() && places.length() >= 3 && places.length() <= 20) {
			System.out.println("Historical place data is valid");
			this.historicalPlacesRepository.visiting(places);

		} else {
			System.out.println("Historical place data invalid");
		}

		return false;
	}
}
