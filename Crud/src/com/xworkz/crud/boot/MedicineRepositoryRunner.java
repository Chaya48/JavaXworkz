package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.MedicineRepository;
import com.xworkz.crud.app.repository.MedicineRepositoryImpl;

public class MedicineRepositoryRunner {

	public static void main(String[] args) {
System.out.println("invoking main in MedicineRepositoryRunner");

MedicineRepository medicine=new MedicineRepositoryImpl();
medicine.cure("Acetaminophen");
medicine.cure("Azithromycin");
medicine.cure("Ibuprofen");
medicine.cure("Aspirin");
medicine.cure("Amitriptyline");
medicine.cure("Aripiprazole");
medicine.cure("Amlodipine");
medicine.cure("Diclofenac");
medicine.cure("Diazenpam");
medicine.cure("Amoxicilin");
medicine.cure("cymbalta");

	}

}
