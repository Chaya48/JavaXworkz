package com.xworkz.engDTO.app.Repository;

import com.xworkz.engDTO.app.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository {

	private EngineerDTO[] dtos = new EngineerDTO[TOTAL_NUMBER];
	private int position;

	@Override
	public void save(EngineerDTO dto) {
		System.out.println("invoking save in engineerRepositoryImpl");
		if (position < TOTAL_NUMBER) {
			this.dtos[position] = dto;
			System.out.println("dto is " + dto + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("storage is full");
		}
	}

	@Override
	public boolean isExist(EngineerDTO dto) {
		System.out.println("invoking isExist in engineerRepositoryImpl");
		for (int index = 0; index < this.position; index++) {
			EngineerDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("data is already exist");
				return true;
			}
		}
		return EngineerRepository.super.isExist(dto);
	}

	@Override
	public EngineerDTO findById(String id) {
		System.out.println("invoking findById " + id);
		System.out.println("at position " + this.position);
		for (int index = 0; index < this.position; index++) {
			EngineerDTO dto = this.dtos[index];
			if (dto.getId().equals(id)) {
				System.out.println("dto is found by id");
				return dto;
			} else {
				System.err.println("no data matched");
			}
		}
		return EngineerRepository.super.findById(id);
	}

	@Override
	public EngineerDTO findByName(String name) {
		System.out.println("invoking findByName " + name);
		System.out.println("at position " + this.position);
		for (int index = 0; index < this.position; index++) {
			EngineerDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("dto is found by name");
				return dto;
			} else {
				System.err.println("no data matched");
			}
		}
		return EngineerRepository.super.findByName(name);
	}

	@Override
	public EngineerDTO findByCollageName(String collageName) {
		System.out.println("invoking findByCollageName " + collageName);
		System.out.println("at position " + this.position);
		for (int index = 0; index < this.position; index++) {
			EngineerDTO dto = this.dtos[index];
			if (dto.getCollageName().equals(collageName)) {
				System.out.println("dto is found by collage");
				return dto;
			} else {
				System.err.println("no data matched");
			}
		}
		return EngineerRepository.super.findByCollageName(collageName);
	}

	@Override
	public EngineerDTO findByNameAndCollageName(String name, String collageName) {
		System.out.println("invoking findByNameAndCollageName " + collageName + name);
		System.out.println("at position " + this.position);
		for (int index = 0; index < this.position; index++) {
			EngineerDTO dto = this.dtos[index];
			if (dto.getName().equals(name) && dto.getCollageName().equals(collageName)) {
				System.out.println("dto is found by collage");
				return dto;
			} else {
				System.err.println("no data matched");
			}
		}

		return EngineerRepository.super.findByNameAndCollageName(name, collageName);

	}
}
