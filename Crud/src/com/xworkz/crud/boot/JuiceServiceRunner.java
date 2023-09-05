package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.JuiceRepository;
import com.xworkz.crud.app.repository.JuiceRepositoryImpl;
import com.xworkz.crud.app.service.JuiceService;
import com.xworkz.crud.app.service.JuiceServiceImpl;

public class JuiceServiceRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in juiceServiceRunner");

		JuiceRepository juiceRepository = new JuiceRepositoryImpl();

		JuiceService juiceService = new JuiceServiceImpl(juiceRepository);

		boolean saved = juiceService.validateAndSave("Slice");
		System.out.println("saved " + saved);
		juiceService.validateAndSave("Slice");
	}

}
