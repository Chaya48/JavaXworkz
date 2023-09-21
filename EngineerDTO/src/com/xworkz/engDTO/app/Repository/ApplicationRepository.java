package com.xworkz.engDTO.app.Repository;

import com.xworkz.engDTO.app.dto.ApplicationDTO;

public interface ApplicationRepository {

	int TOTAL_NUMBERS=5;
	
	void save(ApplicationDTO dto);
	
	default boolean isExist(ApplicationDTO dto) {
		return false;
	}
	default ApplicationDTO findByName(String name) {
		return null;
	}
	default ApplicationDTO findByNameAndDevelopedBy(String name,String developedBy) {
		return null;
	}
}
