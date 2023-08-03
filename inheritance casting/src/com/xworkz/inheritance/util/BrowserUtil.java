package com.xworkz.inheritance.util;

import com.xworkz.inheritance.app1.Browser;
import com.xworkz.inheritance.app1.ChromBrowser;
import com.xworkz.inheritance.app1.EdgeBrowser;
import com.xworkz.inheritance.app1.FireFox;
import com.xworkz.inheritance.app1.OperaBrowser;

public class BrowserUtil extends Browser{
	public void run(Browser browser)
	{
		Browser browser2 = new Browser();
		browser2.getTypeOfBrowser();
		
		if(browser instanceof ChromBrowser)
		{
			Browser chrome = new ChromBrowser();
			chrome.getTypeOfBrowser();
			
			ChromBrowser chrome2=(ChromBrowser)chrome;
			chrome2.getCompanyName();
		}
		
		if(browser instanceof FireFox)
		{
			Browser fireFox=new FireFox();
			fireFox.getTypeOfBrowser();
			
			FireFox fireFox2=(FireFox)fireFox;
			fireFox2.getCompanyName();
		}
		
		if(browser instanceof OperaBrowser)
		{
			Browser opera=new Browser();
			opera.getTypeOfBrowser();
			
			OperaBrowser opera2=new OperaBrowser();
			opera2.getCompanyName();
		}
		
		if(browser instanceof EdgeBrowser)
		{
			Browser micro=new Browser();
			micro.getTypeOfBrowser();
			
			EdgeBrowser micro2=new EdgeBrowser();
			micro2.getCompanyName();
		}
	}

}
