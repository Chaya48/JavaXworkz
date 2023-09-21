package com.xworkz.engDTO.app.Repository;

import com.xworkz.engDTO.app.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {

	private ApplicationDTO[] dtos = new ApplicationDTO[TOTAL_NUMBERS];
	private int position;

	@Override
	public void save(ApplicationDTO dto) {
		System.out.println("invoking save in ApplicationRepositoryImpl");
		if (position < TOTAL_NUMBERS) {
			this.dtos[position] = dto;
			System.out.println("dto is " + dto + " at position " + this.position);
			this.position++;
		} else {
			System.out.println("storeage is full");
		}
	}

	@Override
	public boolean isExist(ApplicationDTO dto) {
		System.out.println("running isexist in " + getClass().getSimpleName());
		for (int index = 0; index < this.position; index++) {
			ApplicationDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("data is already exist");
				return true;
			}
		}
		return ApplicationRepository.super.isExist(dto);
	}

	@Override
	public ApplicationDTO findByName(String name) {
		System.out.println("invoking findByName " + name);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			ApplicationDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("dto found in name");
				return dto;
			} else {
				System.out.println("data is not mathched");
			}
		}
		return ApplicationRepository.super.findByName(name);
	}

	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {
		System.out.println("invoking findByNameAndDevepedBy " + name + developedBy);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			ApplicationDTO dto = this.dtos[index];
			if (dto.getName().equals(name) && dto.getDevelopedBy().equals(developedBy)) {
				System.out.println("dto found in name and developedBy");
				return dto;
			} else {
				System.out.println("data is not matched");
			}
		}

		return ApplicationRepository.super.findByNameAndDevelopedBy(name, developedBy);
	}

}
