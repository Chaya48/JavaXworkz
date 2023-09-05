package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.HistoricalPlacesRepository;
import com.xworkz.crud.app.repository.HistoricalPlacesRepositoryImpl;
import com.xworkz.crud.app.service.HistoricalPlaceService;
import com.xworkz.crud.app.service.HistoricalPlaceServiceImpl;

public class HistoricalPlaceServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HistoricalPlaceRunner");
		HistoricalPlacesRepository historicalPlaceRepository=new HistoricalPlacesRepositoryImpl();
		HistoricalPlaceService historicalPlaceService=new HistoricalPlaceServiceImpl(historicalPlaceRepository);
		historicalPlaceService.validateAndSave("Halebidu");

	}

}
