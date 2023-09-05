package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.MedicineRepository;
import com.xworkz.crud.app.repository.MedicineRepositoryImpl;
import com.xworkz.crud.app.service.MedicineService;
import com.xworkz.crud.app.service.MedicineServiceImpl;

public class MedicineServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MedicineServiceRunner");
		MedicineRepository medicineRepository = new MedicineRepositoryImpl();
		MedicineService medicineService = new MedicineServiceImpl(medicineRepository);
		medicineService.validateAndSave("Cipla");

	}

}
