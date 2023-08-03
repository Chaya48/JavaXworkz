package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app.MobileShowroom;
import com.xworkz.inheritance.app.Showroom;
import com.xworkz.inheritance.app.WatchShowroom;
import com.xworkz.inheritance.util.ShowroomUtil;

public class ShowroomRunner {

	public static void main(String[] args) {

Showroom room=new Showroom();
		
		WatchShowroom room2=new WatchShowroom();
		
		MobileShowroom room3 =new MobileShowroom();
		
		ShowroomUtil roomUtil=new ShowroomUtil();
		System.out.println("Calling run method with showroom ref");
		roomUtil.run(room);
		System.out.println("----------------------------------------");
		System.out.println("Calling run method with Watch Showroom ref");
		roomUtil.run(room2);
		System.out.println("----------------------------------------");
		System.out.println("Calling run method with Mobile showroom ref");
		roomUtil.run(room3);
	}

}
