package com.xworkz.crud.app.Service;

import com.xworkz.crud.app.repository.CountryRepository;
import com.xworkz.crud.app.repository.CountryRepositoryImpl;

public class CountryServiceImpl implements CountryService {
	
	private CountryRepository CountryRepositoryImpl;
	
	public CountryServiceImpl(CountryRepository CountryRepositoryImpl) {
this.CountryRepositoryImpl=CountryRepositoryImpl;
	}
	
	@Override
	public boolean validateAndSave(String country) {
		System.out.println("invoking validateAndSave from " + this.getClass().getSimpleName());
		if (country != null && !country.isEmpty() && country.length() <= 20) {
			if (!this.CountryRepositoryImpl.isExist(country)) {
				System.out.println("juice is" + country);
				this.CountryRepositoryImpl.surfaceArea(country);
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

