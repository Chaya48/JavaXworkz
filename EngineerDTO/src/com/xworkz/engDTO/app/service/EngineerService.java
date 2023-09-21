package com.xworkz.engDTO.app.service;

import com.xworkz.engDTO.app.dto.EngineerDTO;

public interface EngineerService {

	boolean validateAndSave(EngineerDTO dto);

	default boolean isExist(EngineerDTO dto) {
		return false;
	}

	default EngineerDTO findById(String id) {
		return null;
	}

	default EngineerDTO findByName(String name) {
		return null;
	}

	default EngineerDTO findByCollageName(String collageName) {
		return null;
	}

	default EngineerDTO findByNameAndCollageName(String name, String collageName) {
		return null;
	}
}
