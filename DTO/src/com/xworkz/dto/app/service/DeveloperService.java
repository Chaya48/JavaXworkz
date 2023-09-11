package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DeveloperDTO;

public interface DeveloperService {

	boolean validateAndSave(DeveloperDTO dto);
	
	default boolean isExist(DeveloperDTO dto) {
		return false;
	}
	default DeveloperDTO findByName(String name) {
		return null;
	}
	default DeveloperDTO findByWorkingFor(String workingFor) {
		return null;
	}
	default DeveloperDTO findByDestination(String destination) {
		return null;
	}
	default DeveloperDTO findByNameAndWorkingFor(String name,String workingfor) {
		return null;
	}
	default DeveloperDTO findByNameAndSalaryAndDestination(String name,double salary,String destination) {
		return null;
	}
}
