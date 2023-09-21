package com.xworkz.engDTO.app.service;

import com.xworkz.engDTO.app.Repository.GeneratorRepository;
import com.xworkz.engDTO.app.dto.ApplicationDTO;
import com.xworkz.engDTO.app.dto.GeneratorDTO;

public class GeneratorServiceImpl implements GeneratorService {

	private GeneratorRepository generatorRepository;

	public GeneratorServiceImpl(GeneratorRepository generatorRepository) {
		this.generatorRepository = generatorRepository;
	}

	@Override
	public boolean validateAndSava(GeneratorDTO dto) {
		if (dto != null) {
			String brand = dto.getBrand();
			String fuelType = dto.getFuelType();
			String powerSource = dto.getPowerSource();
			double weight = dto.getWeight();
			int outputWattage = dto.getOutputWattage();
			String specialFeature = dto.getSpecialFeature();
			double height = dto.getHeight();
			int frequency = dto.getFrequency();
			int voltage = dto.getVoltage();
			int current = dto.getCurrent();

			if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() < 20) {
				System.out.println("brand is valid");
			} else {
				System.err.println("brand is invalid");
				return false;
			}
			if (fuelType != null && !fuelType.isEmpty() && fuelType.length() > 3 && fuelType.length() < 20) {
				System.out.println("fuelType is valid");
			} else {
				System.err.println("fuelType is invalid");
				return false;
			}
			if (powerSource != null && !powerSource.isEmpty() && powerSource.length() > 3
					&& powerSource.length() < 20) {
				System.out.println("powerSource is valid");
			} else {
				System.err.println("powerSource is invalid");
				return false;
			}
			if (weight != 0 && weight >= 0) {
				System.out.println("weight is valid");
			} else {
				System.err.println("weight is invalid");
				return false;
			}
			if (outputWattage != 0 && outputWattage >= 0) {
				System.out.println("outputWattage is valid");
			} else {
				System.err.println("outputWattage is invalid");
				return false;
			}
			if (specialFeature != null && !specialFeature.isEmpty() && specialFeature.length() > 3
					&& specialFeature.length() < 20) {
				System.out.println("specialFeature is valid");
			} else {
				System.err.println("specialFeature is invalid");
				return false;
			}
			if (height != 0 && height >= 0) {
				System.out.println("height is valid");
			} else {
				System.err.println("height is invalid");
				return false;
			}

			if (frequency != 0 && frequency >= 0) {
				System.out.println("frequency is valid");
			} else {
				System.err.println("frequency is invalid");
				return false;
			}

			if (voltage != 0 && voltage >= 0) {
				System.out.println("voltage is valid");
			} else {
				System.err.println("voltage is invalid");
				return false;
			}

			if (current != 0 && current >= 0) {
				System.out.println("current is valid");
			} else {
				System.err.println("current is invalid");
				return false;
			}
			System.out.println("data is valid");
			boolean exits = generatorRepository.isExist(dto);
			if (!exits) {
				this.generatorRepository.save(dto);
			} else {
				System.err.println(exits);
			}

			return true;
		} else {
			System.err.println("data is invalid");
		}
		return false;
	}

	@Override
	public GeneratorDTO findByBrand(String brand) {
		System.out.println("invoking findByBrand " + brand);
		if (brand != null && brand.isEmpty() && brand.length() > 3 && brand.length() < 20) {
			System.out.println("brand is valid");
			GeneratorDTO dto = this.generatorRepository.findByBrand(brand);
			return dto;
		} else {
			System.err.println("brand is invalid");
		}
		return GeneratorService.super.findByBrand(brand);
	}

}
