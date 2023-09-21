package com.xworkz.engDTO.app.service;

import com.xworkz.engDTO.app.dto.ApplicationDTO;

public interface ApplicationService {

	boolean validateAndSava(ApplicationDTO dto);

	default boolean isExist(ApplicationDTO dto) {
		return false;
	}

	default ApplicationDTO findByName(String name) {
		return null;
	}

	default ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {
		return null;
	}
}
