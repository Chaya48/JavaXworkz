package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PatientRepository;
import com.xworkz.crud.app.repository.PatientRepositoryImpl;
import com.xworkz.crud.app.service.PatientService;
import com.xworkz.crud.app.service.PatientServiceImpl;

public class PatientServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PatientRunner");
		PatientRepository patientRepository=new PatientRepositoryImpl();
		PatientService patientService=new PatientServiceImpl(patientRepository);
		patientService.validateAndSave("BNG");

	}

}
