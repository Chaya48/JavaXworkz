package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {

	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean validateAndSave(String juice) {
		System.out.println("invoking validateAndSave from " + this.getClass().getSimpleName());
		if (juice != null && !juice.isEmpty() && juice.length() <= 20) {
			if (!this.juiceRepository.isExist(juice)) {
				System.out.println("juice is" + juice);
				this.juiceRepository.store(juice);
				return true;
			} else {
				System.err.println("juice is already stored");
			}
		} else {
			System.err.println("juice data is invalid");
		}
		return false;
	}

}
