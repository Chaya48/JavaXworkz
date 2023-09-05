package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepository;

	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public void validateAndSave(String patient) {
		System.out.println("invoking validatePlace from " + this.getClass().getSimpleName());
		if (patient != null && !patient.isEmpty() && patient.length() >= 3 && patient.length() <= 20) {
			System.out.println("Patient data is valid");
			this.patientRepository.bedRest(patient);
		} else {
			System.out.println("Patient data invalid");
		}

	}
}
