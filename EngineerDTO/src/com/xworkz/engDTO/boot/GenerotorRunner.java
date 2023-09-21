package com.xworkz.engDTO.boot;

import com.xworkz.engDTO.app.Repository.GeneratorRepository;
import com.xworkz.engDTO.app.Repository.GeneratorRepositoryImpl;
import com.xworkz.engDTO.app.dto.GeneratorDTO;
import com.xworkz.engDTO.app.service.GeneratorService;
import com.xworkz.engDTO.app.service.GeneratorServiceImpl;

public class GenerotorRunner {

	public static void main(String[] args) {

		GeneratorRepository repository=new GeneratorRepositoryImpl();
		GeneratorService service=new GeneratorServiceImpl(repository);
		GeneratorDTO dto=new GeneratorDTO("Generic","Gasoline", "FuelPowered", 48, 300, "portable", 40,50 , 230, 10);
		service.validateAndSava(dto);
		GeneratorDTO dto2=new GeneratorDTO("Generic","Gasoline", "FuelPowered", 48, 300, "portable", 40,50 , 230, 10);
		service.validateAndSava(dto2);
	
	}

}
