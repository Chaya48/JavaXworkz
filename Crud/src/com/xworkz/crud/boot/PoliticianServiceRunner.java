package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PoliticianRepository;
import com.xworkz.crud.app.repository.PoliticianRepositoryImpl;
import com.xworkz.crud.app.service.PoliticianService;
import com.xworkz.crud.app.service.PoliticianServiceImpl;

public class PoliticianServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PoliticianServiceRunner");
	    PoliticianRepository politcianRepository = new PoliticianRepositoryImpl();
		PoliticianService politicianService = new PoliticianServiceImpl(politcianRepository);
		politicianService.validateExperience("BNG");
	}

}
