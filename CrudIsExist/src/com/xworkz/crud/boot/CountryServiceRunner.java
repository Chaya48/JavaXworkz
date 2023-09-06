package com.xworkz.crud.boot;

import com.xworkz.crud.app.Service.CountryService;
import com.xworkz.crud.app.Service.CountryServiceImpl;
import com.xworkz.crud.app.repository.CountryRepository;
import com.xworkz.crud.app.repository.CountryRepositoryImpl;

public class CountryServiceRunner {

	public static void main(String[] args) {

		CountryRepository countryRepository=new CountryRepositoryImpl();
		CountryService countryService=new CountryServiceImpl(countryRepository);
		countryService.validateAndSave("India");
		countryService.validateAndSave("USA");
	}

}
