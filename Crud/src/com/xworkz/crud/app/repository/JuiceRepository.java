package com.xworkz.crud.app.repository;

public interface JuiceRepository {

	int TOTAL_ITEM = 10;

	void store(String juice);

	default boolean isExist(String juice) {
		return false;

	}
}
