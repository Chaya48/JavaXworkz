package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.MedicineRepository;

public class MedicineServiceImpl implements MedicineService {

	private MedicineRepository medicineRepository;

	public MedicineServiceImpl(MedicineRepository medicineRepository) {
		this.medicineRepository = medicineRepository;
	}

	@Override
	public void validateAndSave(String medicine) {
		System.out.println("invoking validateName from " + this.getClass().getSimpleName());
		if (medicine != null && !medicine.isEmpty() && medicine.length() >= 3
				&& medicine.length() <= 20) {
			System.out.println("Medicine data is valid");
			this.medicineRepository.cure(medicine);
		} else {
			System.out.println("Medicine data invalid");
		}

	}
}
