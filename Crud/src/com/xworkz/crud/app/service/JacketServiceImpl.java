package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.JacketRepository;

public class JacketServiceImpl  implements JacketService{
	private JacketRepository jacketRepository;

	public JacketServiceImpl(JacketRepository jacketRepository) {
		this.jacketRepository = jacketRepository;
	}

	@Override
	public void validateBrand(String brand) {
		System.out.println("invoking validateBrand from " + this.getClass().getSimpleName());
		if (brand != null && !brand.isEmpty() && brand.length() >= 3 && brand.length() <= 20) {
			System.out.println("Jacket data is valid");
			this.jacketRepository.color(brand);
		} else {
			System.out.println("Jacket data invalid");
		}

	}
}
