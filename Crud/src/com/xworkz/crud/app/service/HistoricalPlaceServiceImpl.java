package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.HistoricalPlacesRepository;

public class HistoricalPlaceServiceImpl implements HistoricalPlaceService {

	private HistoricalPlacesRepository historicalPlacesRepository;

	public HistoricalPlaceServiceImpl(HistoricalPlacesRepository historicalPlaceRepository) {
		this.historicalPlacesRepository = historicalPlaceRepository;
	}

	@Override
	public boolean validateHistory(String name) {
		System.out.println("invoking validateHistory from " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Historical place data is valid");
			this.historicalPlacesRepository.place(name);

		} else {
			System.out.println("Historical place data invalid");
		}

		return false;
	}
}
