package com.xworkz.crud.boot;

import com.xworkz.crud.app.Service.TrainNoService;
import com.xworkz.crud.app.Service.TrainNoServiceImpl;
import com.xworkz.crud.app.repository.TrainNoRepository;
import com.xworkz.crud.app.repository.TrainNoRepositoryImpl;

public class TrainNoServiceRunner {

	public static void main(String[] args) {

		TrainNoRepository trainNoRepository=new TrainNoRepositoryImpl();
		TrainNoService trainNoService=new TrainNoServiceImpl(trainNoRepository);
		trainNoService.validateAndSave("16526");
		trainNoService.validateAndSave("12658");
	}

}
