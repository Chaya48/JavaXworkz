package com.xworkz.crud.app.Service;

import com.xworkz.crud.app.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {

	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository LocationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean validateAndSave(String location) {
		System.out.println("invoking validateAndSave from " + this.getClass().getSimpleName());
		if (location != null && !location.isEmpty() && location.length() <= 20) {
			if (!this.locationRepository.isExist(location)) {
				System.out.println("juice is" + location);
				this.locationRepository.surfaceArea(location);
				return true;
			} else {
				System.err.println("location is already stored");
			}
		} else {
			System.err.println("location data is invalid");
		}
		return false;

	}

}
