package com.xworkz.abstact.app;

public class Custom {

	private Verification verification;
	

	public void verify() {
		System.out.println("invoking verifyCitizren in Custom");
		this.verification.verify();
	}

	public void setVerification(Verification verification) {
		this.verification = verification;
	}

}
