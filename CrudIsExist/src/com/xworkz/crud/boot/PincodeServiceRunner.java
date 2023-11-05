package com.xworkz.crud.boot;

import com.xworkz.crud.app.Service.PincodeService;
import com.xworkz.crud.app.Service.PincodeServiceImpl;
import com.xworkz.crud.app.repository.PincodeRepository;
import com.xworkz.crud.app.repository.PincodeRepositoryImpl;

public class PincodeServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in pincodeRunner");

		PincodeRepository pincodeRepository = new PincodeRepositoryImpl();
		PincodeService pincodeService = new PincodeServiceImpl(pincodeRepository);
		boolean saved = pincodeService.validateAndSave(573102);
		System.out.println("saved " + saved);
		pincodeService.validateAndSave(573201);
	}

}
