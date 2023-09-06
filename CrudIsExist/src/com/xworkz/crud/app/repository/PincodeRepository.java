package com.xworkz.crud.app.repository;

public interface PincodeRepository {

	int TOTAL_NUMBERS=10;
	
	void identify(int pincode);
	
 default boolean isExist(int pincode) {
		return false;
	}
}
