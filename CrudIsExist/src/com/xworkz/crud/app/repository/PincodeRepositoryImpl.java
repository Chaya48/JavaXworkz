package com.xworkz.crud.app.repository;

import java.security.PublicKey;

public class PincodeRepositoryImpl implements PincodeRepository {

	private int[] pincodes = new int[TOTAL_NUMBERS];
	private int position;

	@Override
	public void identify(int pincode) {
		System.out.println("invoking identify in PincodeRepository");
		if (this.position < TOTAL_NUMBERS) {
			this.pincodes[position] = pincode;
			System.out.println("pincode is :" + pincode + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("pincode is invalid");
		}
	}

	@Override
	public boolean isExist(int pincode) {
		for (int index = 0; index <= this.position; index++) {
			int temp = pincodes[index];
			if (temp != 0 && temp == (pincode)) {
				System.out.println("pincode is alredy exist please select another");
				return true;
			}

		}
		return false;
	}

}
