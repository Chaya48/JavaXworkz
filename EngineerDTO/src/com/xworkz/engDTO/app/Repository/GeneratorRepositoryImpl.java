package com.xworkz.engDTO.app.Repository;

import com.xworkz.engDTO.app.dto.GeneratorDTO;

public class GeneratorRepositoryImpl implements GeneratorRepository {

	private GeneratorDTO[] dtos = new GeneratorDTO[TOTAL_ITEM];
	private int position;

	@Override
	public void save(GeneratorDTO dto) {
		System.out.println("invoking save in GeneratorRepositoryImpl");
		if (position < TOTAL_ITEM) {
			this.dtos[position] = dto;
			System.out.println("dto is " + dto + " at position " + this.position);
			this.position++;
		} else {
			System.out.println("storeage is full");
		}
	}

	@Override
	public boolean isExist(GeneratorDTO dto) {
		System.out.println("running isexist in " + getClass().getSimpleName());
		for (int index = 0; index < this.position; index++) {
			GeneratorDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("data is already exist");
				return true;
			}
		}
		return GeneratorRepository.super.isExist(dto);
	}

	@Override
	public GeneratorDTO findByBrand(String brand) {
		System.out.println("invoking findByBrand " + brand);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			GeneratorDTO dto = this.dtos[index];
			if (dto.getBrand().equals(brand)) {
				System.out.println("dto found in brand");
				return dto;
			} else {
				System.out.println("data is not mathched");
			}
		}
		return GeneratorRepository.super.findByBrand(brand);
	}

}
