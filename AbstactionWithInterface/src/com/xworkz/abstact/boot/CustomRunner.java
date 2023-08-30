package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Custom;
import com.xworkz.abstact.app.Verification;
import com.xworkz.abstact.app.impl.AdharVerification;
import com.xworkz.abstact.app.impl.PassportVerification;

public class CustomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CustomRunner");

		Verification verification = new PassportVerification();
		Verification verification2 = new AdharVerification();

		Custom custom = new Custom();
		custom.setVerification(verification);
		custom.verify();
	}

}
