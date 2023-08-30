package com.xworkz.abstact.app.impl;

import com.xworkz.abstact.app.Internet;

public class MicrosoftEdgeBrowser implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking connect in MicrosoftEdgeBrowser");

	}

}
