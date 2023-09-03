package com.xworkz.crud.app.repository;

public class PatientRepositoryImpl implements PatientRepository {
	
	private String[] patient = new String[Total_NUMBER];
	private int position;

	@Override
	public void bedRest(String patient) {
		System.out.println("invoking bedRest in patient");
		if (this.position < Total_NUMBER) {
			this.patient[position]=patient;
			System.out.println("patient name is " + patient + " in position " + this.position);
			this.position++;
		}
		else {
			System.err.println("item is exdes more than list");
		}

	}

}
