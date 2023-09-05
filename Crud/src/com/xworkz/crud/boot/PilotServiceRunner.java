package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PilotRepository;
import com.xworkz.crud.app.repository.PilotRepositoryImpl;
import com.xworkz.crud.app.service.PilotService;
import com.xworkz.crud.app.service.PilotServiceImpl;

public class PilotServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PilotRunner");
		PilotRepository pilotRepository = new PilotRepositoryImpl();
		PilotService pilotService = new PilotServiceImpl(pilotRepository);
		pilotService.validateNavigation("Banglore");

	}

}
