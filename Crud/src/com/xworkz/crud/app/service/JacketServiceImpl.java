package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.JacketRepository;

public class JacketServiceImpl  implements JacketService{
	private JacketRepository jacketRepository;

	public JacketServiceImpl(JacketRepository jacketRepository) {
		this.jacketRepository = jacketRepository;
	}

	@Override
	public void validateAndSave(String jacket) {
		System.out.println("invoking validateBrand from " + this.getClass().getSimpleName());
		if (jacket != null && !jacket.isEmpty() && jacket.length() >= 3 && jacket.length() <= 20) {
			System.out.println("Jacket data is valid");
			this.jacketRepository.cover(jacket);
		} else {
			System.out.println("Jacket data invalid");
		}

	}
}
