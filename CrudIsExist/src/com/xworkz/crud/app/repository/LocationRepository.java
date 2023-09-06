package com.xworkz.crud.app.repository;

public interface LocationRepository {

	int TOTAL_NAMES=10;
	
	void surfaceArea(String location);
	
	default boolean isExist(String location) {
		return false;
	}
}
