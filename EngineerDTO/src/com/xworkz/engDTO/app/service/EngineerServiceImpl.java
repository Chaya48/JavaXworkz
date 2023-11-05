package com.xworkz.engDTO.app.service;

import com.xworkz.engDTO.app.Repository.EngineerRepository;
import com.xworkz.engDTO.app.dto.EngineerDTO;

public class EngineerServiceImpl implements EngineerService {

	private EngineerRepository engineerRepository;

	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository = engineerRepository;
	}

	@Override
	public boolean validateAndSave(EngineerDTO dto) {
		if (dto != null) {
			String id = dto.getId();
			String name = dto.getName();
			String collageName = dto.getCollageName();

			if (id != null && !id.isEmpty() && id.length() > 3 && id.length() < 20) {
				System.out.println("id is valid");
			} else {
				System.err.println("id is invalid");
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
			}
			if (collageName != null && !collageName.isEmpty() && collageName.length() >=3
					&& collageName.length() < 20) {
				System.out.println("collage name is valid");
			} else {
				System.err.println("collageName is invalid");
			}
		}
		return false;
	}

	@Override
	public EngineerDTO findById(String id) {
		System.out.println("invoking findById" + id);
		if (id != null && id.isEmpty() && id.length() > 3 && id.length() < 20) {
			System.out.println("id is valid");
			EngineerDTO dto = this.engineerRepository.findById(id);
			return dto;
		} else {
			System.err.println("id is invalid");
		}

		return EngineerService.super.findById(id);
	}
}
