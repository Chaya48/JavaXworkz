package com.xworkz.crud.app.repository;

public class CountryRepositoryImpl implements CountryRepository {

	private String[] counties = new String[TOTAL_NAMES];
	private int position = 0;
	@Override
	public void surfaceArea(String country) {
		if (this.position < TOTAL_NAMES) {
			this.counties[position] = country;
			System.out.println("location name is :" + country + " at position " + this.position);
			this.position++;
		}
	}
	@Override
	public boolean isExist(String country) {
	for(int index=0; index<=position; index++) {
		String temp=this.counties[index];
		if (temp != null && temp.equals(country)) {
			System.err.println("counties is already exit plese select another");
			return true;
		}

	}
		return false;
	}
}
