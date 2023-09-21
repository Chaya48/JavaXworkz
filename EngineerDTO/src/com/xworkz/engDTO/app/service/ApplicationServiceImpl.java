package com.xworkz.engDTO.app.service;

import com.xworkz.engDTO.app.Repository.ApplicationRepository;
import com.xworkz.engDTO.app.dto.ApplicationDTO;

public class ApplicationServiceImpl implements ApplicationService {

	private ApplicationRepository applicationRepository;

	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	@Override
	public boolean validateAndSava(ApplicationDTO dto) {
		if (dto != null) {
			int id = dto.getId();
			String name = dto.getName();
			String developedBy = dto.getDevelopedBy();
			String developedAt = dto.getDevelopedAt();
			String version = dto.getVersion();

			if (id != 0 && id >= 0) {
				System.out.println("id is valid");
			} else {
				System.err.println("id is invalid");
				return false;
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}
			if (developedBy != null && ! developedBy.isEmpty() && developedBy.length() > 3 && developedBy.length() < 20) {
				System.out.println("developedBy is valid");
			} else {
				System.err.println("developedBy is invalid");
				return false;
			}
			if (developedAt != null && !developedAt.isEmpty() && developedAt.length() > 3 && developedBy.length() < 20) {
				System.out.println("developedAt is valid");
			} else {
				System.err.println("developedAt is invalid");
				return false;
			}
			System.out.println("data is valid");
			boolean exits = applicationRepository.isExist(dto);
			if(!exits) {
				this.applicationRepository.save(dto);
			}else {
				System.err.println(exits);
			}
			
			return true;
		} else {
			System.err.println("data is invalid");
		}
		return false;
	}

	@Override
	public ApplicationDTO findByName(String name) {
		System.out.println("invoking findByName " + name);
		if (name != null && name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("name is valid");
			ApplicationDTO dto = this.applicationRepository.findByName(name);
			return dto;
		} else {
			System.err.println("name is invalid");
		}
		return ApplicationService.super.findByName(name);
	}

	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {
		System.out.println("invoking findByNameAndDevelopedBy" + name + developedBy);
		if (name != null && name.isEmpty() && name.length() > 3 && name.length() < 20 && developedBy != null
				&& developedBy.isEmpty() && developedBy.length() > 3 && developedBy.length() < 20) {
			System.out.println("name and developedBy is valid");
			ApplicationDTO dto = this.applicationRepository.findByNameAndDevelopedBy(name, developedBy);
			return dto;
		} else {
			System.err.println("name and developedBy is invalid");
		}
		return ApplicationService.super.findByNameAndDevelopedBy(name, developedBy);
	}
	
}
