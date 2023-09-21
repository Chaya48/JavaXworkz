package com.xworkz.engDTO.app.Repository;

import com.xworkz.engDTO.app.dto.EngineerDTO;

public interface EngineerRepository {

	int TOTAL_NUMBER = 5;

	void save(EngineerDTO dto);

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
