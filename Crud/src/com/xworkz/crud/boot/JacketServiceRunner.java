package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.JacketRepository;
import com.xworkz.crud.app.repository.JacketRepositoryimpl;
import com.xworkz.crud.app.service.JacketService;
import com.xworkz.crud.app.service.JacketServiceImpl;

public class JacketServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in JacketServiceRunner");
		JacketRepository jacketRepsitory = new JacketRepositoryimpl();
		JacketService jacketService = new JacketServiceImpl(jacketRepsitory);
		jacketService.validateBrand("Puma");
	}
	}


