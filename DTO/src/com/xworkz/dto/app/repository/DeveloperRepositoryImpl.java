package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.DeveloperDTO;

public class DeveloperRepositoryImpl implements DeveloperRepository {

	private DeveloperDTO[] dtos = new DeveloperDTO[TOTAL_ITEMS];
	private int position;
	private int salary;

	@Override
	public void save(DeveloperDTO dto) {
		System.out.println("invoking save in developerRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(" dto is " + dto + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("storage is full");
		}
	}

	@Override
	public boolean isExist(DeveloperDTO dto) {
		System.out.println("Running isExist in " + getClass().getSimpleName());
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("data is already exist");
				return true;
			}
		}
		return DeveloperRepository.super.isExist(dto);
	}

	@Override
	public DeveloperDTO findByDestination(String destination) {
		System.out.println("invoking findByDestination " + destination);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(destination)) {
				System.out.println("Dto found with destination");
				return dto;
			} else {
				System.err.println("no data matched");
			}
		}
		return DeveloperRepository.super.findByDestination(destination);
	}

	@Override
	public DeveloperDTO findByName(String name) {
		System.out.println("invoking findByName " + name);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("Dto found with name");
				return dto;
			} else {
				System.err.println("no data matched");
			}
		}
		return DeveloperRepository.super.findByName(name);
	}

	@Override
	public DeveloperDTO findByNameAndSalaryAndDestination(String name, double salary, String destination) {
		System.out.println("invoking findByNameAndSalaryAndDestination " + name + salary + destination);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name) && dto.getSalary() == this.salary
					&& dto.getDestination().equals(destination)) {
				System.out.println("Dto found with name.salary and designation");
				return dto;
			} else {
				System.out.println("no data matched");
			}
		}
		return DeveloperRepository.super.findByNameAndSalaryAndDestination(name, salary, destination);
	}

	@Override
	public DeveloperDTO findByNameAndWorkingFor(String name, String workingFor) {
		System.out.println("invoking findByNameAndWorkingFor " + name + workingFor);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name) && dto.getWorkingFor().equals(workingFor)) {
				System.out.println("Dto found with name and working for");
				return dto;
			} else {
				System.out.println("no data matched");
			}
		}

		return DeveloperRepository.super.findByNameAndWorkingFor(name, workingFor);
	}

	@Override
	public DeveloperDTO findByWorkingFor(String workingFor) {
		System.out.println("invoking findByWorkingFor " + workingFor);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(workingFor)) {
				System.out.println("Dto found with workingFor");
				return dto;
			} else {
				System.out.println("no data matched");

			}
		}
		return DeveloperRepository.super.findByWorkingFor(workingFor);
	}
}
