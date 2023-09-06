package com.xworkz.crud.app.repository;

public interface CountryRepository {

int TOTAL_NAMES=10;
	
	void surfaceArea(String country);
	
	default boolean isExist(String country) {
		return false;
	}
}
