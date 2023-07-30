package com.xworkz.app;

public class Hospital {
	
	public Doctor doctor=new Doctor();
	public Doctor doctor1=new Doctor();
	
	public Nurse nurse=new Nurse();
	public Nurse nurse1=new Nurse();
	
	public Patient patient=new Patient();
	public Patient patient1=new Patient();
	
	
	public void allopathy() {
		if(doctor!=null) {
			this.doctor.examinPatients();
			System.out.println("invoking allopathy in hospital");
		}
		else
		{
			System.err.println("invoking allopathy is null");
		}
	}
	
	public void dentalFacility() {
		if(doctor1!=null) {
			this.doctor1.operation();
			System.out.println("invoking dental facility in hospital");
		}
		else {
			System.err.println("innvoking dental facility is null");
		}
	}
	public void wordOrIndoorFacility() {
		if(nurse!=null) {
			this.nurse.recordingMedicalHistory();
			System.out.println("invoking word or indoor facility in hospital");
		}
		else {
			System.out.println("innvoking word or indoor facility is null");
		}
	}
	public void physiotherapy() {
		if(nurse1!=null) {
			this.nurse1.performinngDiagnosticTests();
			System.out.println("invoking physiotherapy in hospital");
		}
		else {
			System.out.println("invoking physiotherapy is null");
		}
	}
    public void laboratoryServices() {
    	if(patient!=null) {
    		this.patient.treatment();
    		System.out.println("invoking laboratory service in hospital");
    	}
    	else {
    		System.out.println("invoking laboratory service is null");
    	}
    }
    public void xRayServicce() {
    	if(patient1!=null) {
    		this.patient1.sleep();
    		System.out.println("invoking x Ray service in hospital");
    	}
    	else {
    		System.out.println("invoking xray is null");
    	}
    }
}
