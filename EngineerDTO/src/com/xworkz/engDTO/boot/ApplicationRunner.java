package com.xworkz.engDTO.boot;

import com.xworkz.engDTO.app.Repository.ApplicationRepository;
import com.xworkz.engDTO.app.Repository.ApplicationRepositoryImpl;
import com.xworkz.engDTO.app.dto.ApplicationDTO;
import com.xworkz.engDTO.app.service.ApplicationService;
import com.xworkz.engDTO.app.service.ApplicationServiceImpl;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationRepository repository=new ApplicationRepositoryImpl();
		ApplicationService service=new ApplicationServiceImpl(repository);
		ApplicationDTO dto=new ApplicationDTO(1,"whatsapp", "janKoum", "SanJoseStateUniversity", "2.23.12.75");
		service.validateAndSava(dto);
		ApplicationDTO dto1=new ApplicationDTO(1,"whatsapp", "janKoum", "SanJoseStateUniversity", "2.23.12.75");
		service.validateAndSava(dto1);
	}

}
