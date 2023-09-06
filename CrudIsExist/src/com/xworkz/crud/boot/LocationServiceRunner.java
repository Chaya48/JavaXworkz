package com.xworkz.crud.boot;

import com.xworkz.crud.app.Service.LocationService;
import com.xworkz.crud.app.Service.LocationServiceImpl;
import com.xworkz.crud.app.repository.LocationRepository;
import com.xworkz.crud.app.repository.LocationRepositoryImpl;

public class LocationServiceRunner {

	public static void main(String[] args) {

		LocationRepository locationRepository=new LocationRepositoryImpl();
		LocationService locationService=new LocationServiceImpl(locationRepository);
		locationService.validateAndSave("hassan");
		locationService.validateAndSave("hassan");
				
	}

}
