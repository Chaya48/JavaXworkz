package com.xworkz.crud.app.Service;

import com.xworkz.crud.app.repository.MobileNoRepository;

public  class MobileNoServiceImpl implements MobileNoService {

	private MobileNoRepository mobileNoRepository;

	public MobileNoServiceImpl(MobileNoRepository mobileNoRepository) {
		this.mobileNoRepository = mobileNoRepository;
	}

	@Override
	public boolean validateAndSave(long number) {
		System.out.println("invoking validateAndSave from " + getClass().getSimpleName());
		if (number != 0) {
			if (!this.mobileNoRepository.isExist(number)) {
				System.out.println("mobile number  is " + number);
				this.mobileNoRepository.identify(number);
				return true;
			} else {
				System.err.println("pincode is already stored");
			}
		}
		return false;
	}
}
