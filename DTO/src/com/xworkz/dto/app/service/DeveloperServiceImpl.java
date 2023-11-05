package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DeveloperDTO;
import com.xworkz.dto.app.repository.DeveloperRepository;

public class DeveloperServiceImpl implements DeveloperService {

	private DeveloperRepository developerRepository;

	public DeveloperServiceImpl(DeveloperRepository developerRepository) {
		this.developerRepository = developerRepository;
	}

	@Override
	public boolean validateAndSave(DeveloperDTO dto) {

		if (dto != null) {

			String destination = dto.getDestination();
			String name = dto.getName();
			double salary = dto.getSalary();
			int experience = dto.getExperince();
			String workingFor = dto.getWorkingFor();
			boolean difficult = dto.isDefficult();

			if (destination != null && !destination.isEmpty() && destination.length() > 3
					&& destination.length() <= 20) {
				System.out.println("destination is valid ");
			} else {
				System.err.println("destination is invalid");
				return false;
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}
			if (salary != 0 && salary >= 0) {
				System.out.println("salary is valid");
			} else {
				System.err.println("salary is invalid");
				return false;
			}
			if (experience != 0 && experience >= 0) {
				System.out.println("experience is valid");
			} else {
				System.err.println("experience is invalid");
				return false;
			}
			if (workingFor != null && !workingFor.isEmpty() && workingFor.length() > 3 && workingFor.length() <= 20) {
				System.out.println("workingFor is valid");
			} else {
				System.err.println("working is invalid ");
				return false;
			}
			if (difficult == true && !difficult == false) {
				System.out.println("difficult is valid");
			} else {
				System.err.println("difficult is invalid");
				return false;
			}
			System.out.println("data is valid");
			this.developerRepository.save(dto);
			return true;
		} else {
			System.err.println("data is invalid");
		}
		return false;
	}

	@Override
	public DeveloperDTO findByDestination(String destination) {
		System.out.println("invoking findByDestination " + destination);
		if (destination != null && !destination.isEmpty() && destination.length() > 3 && destination.length() < 20) {
			System.out.println("destination is valid");
			DeveloperDTO dto = this.developerRepository.findByDestination(destination);
			return dto;
		} else {
			System.err.println("destination is invalid");
		}
		return DeveloperService.super.findByDestination(destination);
	}

	@Override
	public DeveloperDTO findByName(String name) {
		System.out.println("invoking findByName " + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("name is valid");
			DeveloperDTO dto = this.developerRepository.findByDestination(name);
			return dto;
		} else {
			System.err.println("name is invalid");
		}
		return DeveloperService.super.findByName(name);
	}

	@Override
	public DeveloperDTO findByNameAndSalaryAndDestination(String name, double salary, String destination) {
		System.out.println("invoking findByNameAndSalaryAndDestination " + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("name,salary and destination are valid");
			DeveloperDTO dto = this.developerRepository.findByNameAndSalaryAndDestination(name, salary, destination);
			return dto;
		} else {
			System.err.println("name,salary and destination are invalid");
		}
		return DeveloperService.super.findByNameAndSalaryAndDestination(name, salary, destination);
	}

	@Override
	public DeveloperDTO findByNameAndWorkingFor(String name, String workingFor) {
		System.out.println("invoking findByNameAndWorking" + name + workingFor);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("name, workingFor are valid");
			DeveloperDTO dto = this.developerRepository.findByNameAndWorkingFor(name, workingFor);
			return dto;
		} else {
			System.err.println("name,destination are invalid");
		}
		return DeveloperService.super.findByNameAndWorkingFor(name, workingFor);
	}

	@Override
	public DeveloperDTO findByWorkingFor(String workingFor) {
		System.out.println("invoking findByWorkingFor " + workingFor);
		if (workingFor != null && !workingFor.isEmpty() && workingFor.length() > 3 && workingFor.length() > 20) {
			System.out.println("working is valid");
			DeveloperDTO dto = this.developerRepository.findByWorkingFor(workingFor);
			return dto;
		} else {
			System.err.println("working is invalid");
		}
		return DeveloperService.super.findByWorkingFor(workingFor);
	}
}
