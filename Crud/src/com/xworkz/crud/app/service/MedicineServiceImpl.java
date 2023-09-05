package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.MedicineRepository;

public class MedicineServiceImpl implements MedicineService {

	private MedicineRepository medicineRepository;

	public MedicineServiceImpl(MedicineRepository medicineRepository) {
		this.medicineRepository = medicineRepository;
	}

	@Override
	public void validateName(String madicineName) {
		System.out.println("invoking validateName from " + this.getClass().getSimpleName());
		if (madicineName != null && !madicineName.isEmpty() && madicineName.length() >= 3
				&& madicineName.length() <= 20) {
			System.out.println("Medicine data is valid");
			this.medicineRepository.name(madicineName);
		} else {
			System.out.println("Medicine data invalid");
		}

	}
}
