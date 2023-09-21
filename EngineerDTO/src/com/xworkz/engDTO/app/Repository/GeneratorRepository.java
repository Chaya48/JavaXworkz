package com.xworkz.engDTO.app.Repository;

import com.xworkz.engDTO.app.dto.GeneratorDTO;

public interface GeneratorRepository {

	int TOTAL_ITEM = 10;

	void save(GeneratorDTO dto);

	default boolean isExist(GeneratorDTO dto) {
		return false;
	}

	default GeneratorDTO findByBrand(String brand) {
		return null;
	}
}
