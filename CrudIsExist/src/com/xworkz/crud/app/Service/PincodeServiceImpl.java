package com.xworkz.crud.app.Service;

import com.xworkz.crud.app.repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {

	private PincodeRepository pincodeRepository;

	@Override
	public boolean validateAndSave(int pincode) {
		System.out.println("invoking validateAndSave from " + getClass().getSimpleName());
		if (pincode != 0) {
			if (!this.pincodeRepository.isExist(pincode)) {
				System.out.println("pincode is " + pincode);
				this.pincodeRepository.identify(pincode);
				return true;
			} else {
				System.err.println("pincode is already stored");
			}
		}
		return false;
	}

}
