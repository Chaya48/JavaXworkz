package com.xworkz.inheritance.util;

import com.xworkz.inheritance.app.MobileShowroom;
import com.xworkz.inheritance.app.Showroom;
import com.xworkz.inheritance.app.WatchShowroom;

public class ShowroomUtil  extends Showroom{
	
	public void run(Showroom room)
	{
		Showroom showroom=new Showroom();
		showroom.printLocation();
		
		if(room instanceof WatchShowroom)
		{
			Showroom watchroom=new WatchShowroom();
			watchroom.printLocation();
			
			WatchShowroom watchroom2=(WatchShowroom)watchroom;
			watchroom2.getNameOfShowroom();
			
		}
		
		if(room instanceof MobileShowroom)
		{
			Showroom mobileroom = new MobileShowroom();
			mobileroom.printLocation();
			
			MobileShowroom mobileRoom2=(MobileShowroom)mobileroom;
			mobileRoom2.getGstNo();
		}
	}
}


