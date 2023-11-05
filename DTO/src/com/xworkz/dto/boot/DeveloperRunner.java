package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.DeveloperDTO;
import com.xworkz.dto.app.repository.DeveloperRepository;
import com.xworkz.dto.app.repository.DeveloperRepositoryImpl;
import com.xworkz.dto.app.service.DeveloperService;
import com.xworkz.dto.app.service.DeveloperServiceImpl;

public class DeveloperRunner {

	public static void main(String[] args) {

		DeveloperRepository developerRepository = new DeveloperRepositoryImpl();
		DeveloperService developerService = new DeveloperServiceImpl(developerRepository);
		DeveloperDTO dto = new DeveloperDTO("chaya", 1, 30000, "infoys", "developer", true);
		developerService.validateAndSave(dto);
		DeveloperDTO dto1 = new DeveloperDTO("sushma", 2, 25000, "accenture", "javaDeveloper", true);
		developerService.validateAndSave(dto1);
		DeveloperDTO dto2 = new DeveloperDTO("pooja", 1, 25000, "infoys", "tester", true);
		developerService.validateAndSave(dto2);
	}
}
