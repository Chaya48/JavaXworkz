package com.xworkz.app.boot;

import com.xworkz.app.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital hospital=new Hospital();
		hospital.allopathy();
		
	    Hospital hospital1=new Hospital();
		hospital1.dentalFacility();
		
	    Hospital hospital2=new Hospital();
		hospital2.wordOrIndoorFacility();
		
		Hospital hospital3=new Hospital();
		hospital3.physiotherapy();
		
		Hospital hospital4=new Hospital();
		hospital4.laboratoryServices();
		
		Hospital hospital5=new Hospital();
		hospital5.xRayServicce();
	}

}
