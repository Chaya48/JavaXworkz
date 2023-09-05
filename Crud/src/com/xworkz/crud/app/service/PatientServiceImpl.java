package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepository;

	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public void validPlace(String pname) {
		System.out.println("invoking validatePlace from " + this.getClass().getSimpleName());
		if (pname != null && !pname.isEmpty() && pname.length() >= 3 && pname.length() <= 20) {
			System.out.println("Patient data is valid");
			this.patientRepository.place(pname);
		} else {
			System.out.println("Patient data invalid");
		}

	}
}
