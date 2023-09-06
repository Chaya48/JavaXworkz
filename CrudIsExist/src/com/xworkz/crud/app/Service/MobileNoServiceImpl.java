package com.xworkz.crud.app.Service;

import com.xworkz.crud.app.repository.MobileNoRepository;

public abstract class MobileNoServiceImpl implements MobileNoService {

	private MobileNoRepository mobileNoRepositor;


	@Override
	public boolean validateAndSave(long number) {
		System.out.println("invoking validateAndSave from " + getClass().getSimpleName());
		if (number != 0) {
			if (!this.mobileNoRepositor.isExist(number)) {
				System.out.println("pincode is " + number);
				this.mobileNoRepositor.identify(number);
				return true;
			} else {
				System.err.println("pincode is already stored");
			}
		}
		return false;
	