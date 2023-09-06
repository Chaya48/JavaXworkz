package com.xworkz.crud.app.repository;

public interface MobileNoRepository {

int TOTAL_NUMBERS=10;
	
	void identify(long number);
	
 default boolean isExist(long number) {
		return false;
	}
}
