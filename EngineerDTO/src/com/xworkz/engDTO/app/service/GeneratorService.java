package com.xworkz.engDTO.app.service;

import com.xworkz.engDTO.app.dto.GeneratorDTO;

public interface GeneratorService {

	boolean validateAndSava(GeneratorDTO dto);

	default boolean isExist(GeneratorDTO dto) {
		return false;
	}

	default GeneratorDTO findByBrand(String brand) {
		return null;
	}
}
