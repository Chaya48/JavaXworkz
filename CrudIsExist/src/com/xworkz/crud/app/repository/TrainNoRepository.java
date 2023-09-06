package com.xworkz.crud.app.repository;

public interface TrainNoRepository {

int TOTAL_NUMBERS=10;
	
	void identify(String train);
	
	default boolean isExist(String train) {
		return false;
	}
}
