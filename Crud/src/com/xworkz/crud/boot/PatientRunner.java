package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PatientRepository;
import com.xworkz.crud.app.repository.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in patientRunner");
		
		PatientRepository patient=new PatientRepositoryImpl();
		patient.bedRest("abc");
		patient.bedRest("def");
		patient.bedRest("ghi");
		patient.bedRest("jkl");
		patient.bedRest("mno");
		patient.bedRest("pqr");
		patient.bedRest("stu");
		patient.bedRest("vwx");
		patient.bedRest("yza");
		patient.bedRest("bcd");
		patient.bedRest("efg");

		
	}

}
