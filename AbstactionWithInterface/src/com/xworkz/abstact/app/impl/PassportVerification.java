package com.xworkz.abstact.app.impl;

import com.xworkz.abstact.app.Verification;

public class PassportVerification implements Verification {

	@Override
	public void verify() {
		System.out.println("invoking verify in passport verification");
	}

}
