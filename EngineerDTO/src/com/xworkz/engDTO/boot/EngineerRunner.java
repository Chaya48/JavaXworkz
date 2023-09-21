package com.xworkz.engDTO.boot;

import com.xworkz.engDTO.app.Repository.EngineerRepository;
import com.xworkz.engDTO.app.Repository.EngineerRepositoryImpl;
import com.xworkz.engDTO.app.dto.EngineerDTO;
import com.xworkz.engDTO.app.service.EngineerService;
import com.xworkz.engDTO.app.service.EngineerServiceImpl;

public class EngineerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in engineerRunner");

		EngineerRepository repository = new EngineerRepositoryImpl();
		EngineerService service = new EngineerServiceImpl(repository);
		EngineerDTO dto = new EngineerDTO("4ra20ee02", "chaya", "RIT");
		service.validateAndSave(dto);
	}

}
