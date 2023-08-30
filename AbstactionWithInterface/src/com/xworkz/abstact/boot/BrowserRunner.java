package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Browser;
import com.xworkz.abstact.app.Internet;
import com.xworkz.abstact.app.impl.ChromeBrowser;
import com.xworkz.abstact.app.impl.MicrosoftEdgeBrowser;

public class BrowserRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in browser Runner");
		
		Internet internet=new ChromeBrowser();
		Internet internet2=new MicrosoftEdgeBrowser();
		
		Browser  browser=new Browser();
		browser.setInternet(internet);
		browser.connect();
	}

}
