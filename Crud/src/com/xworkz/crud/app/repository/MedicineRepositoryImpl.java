package com.xworkz.crud.app.repository;

public class MedicineRepositoryImpl implements MedicineRepository {

	private String[] medicine = new String[TOTAL_NAMES];
	private int position;

	@Override
	public void cure(String medicine) {
		System.out.println("invoking cure in medicine");
		if (this.position < TOTAL_NAMES) {
			this.medicine[position] = medicine;
			System.out.println("medicine name is " + medicine + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("item is exdes more than list");
		}
	}

}
