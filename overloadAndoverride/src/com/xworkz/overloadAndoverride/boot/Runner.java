package com.xworkz.overloadAndoverride.boot;

import com.xworkz.overloadAndoverride.app.AlleyStreet;
import com.xworkz.overloadAndoverride.app.AyurvedicHospital;
import com.xworkz.overloadAndoverride.app.Bakery;
import com.xworkz.overloadAndoverride.app.City;
import com.xworkz.overloadAndoverride.app.ComedyTheater;
import com.xworkz.overloadAndoverride.app.DistrictPoliceStation;
import com.xworkz.overloadAndoverride.app.GastroPubs;
import com.xworkz.overloadAndoverride.app.GirlsHostel;
import com.xworkz.overloadAndoverride.app.Hospital;
import com.xworkz.overloadAndoverride.app.Hostel;
import com.xworkz.overloadAndoverride.app.Hotel;
import com.xworkz.overloadAndoverride.app.Library;
import com.xworkz.overloadAndoverride.app.Mall;
import com.xworkz.overloadAndoverride.app.Market;
import com.xworkz.overloadAndoverride.app.NagaraStyleTemple;
import com.xworkz.overloadAndoverride.app.NationalZoo;
import com.xworkz.overloadAndoverride.app.PoliceStation;
import com.xworkz.overloadAndoverride.app.Pub;
import com.xworkz.overloadAndoverride.app.PublicLibrary;
import com.xworkz.overloadAndoverride.app.RegionalMall;
import com.xworkz.overloadAndoverride.app.SmallBakery;
import com.xworkz.overloadAndoverride.app.SmartCity;
import com.xworkz.overloadAndoverride.app.StockMarket;
import com.xworkz.overloadAndoverride.app.Street;
import com.xworkz.overloadAndoverride.app.Temple;
import com.xworkz.overloadAndoverride.app.Theater;
import com.xworkz.overloadAndoverride.app.VegHotel;
import com.xworkz.overloadAndoverride.app.Zoo;

public class Runner {

	public static void main(String[] args) {
		System.out.println("invoking main in Runner");

		Bakery bakery = new Bakery();
		bakery.bake();
		bakery.bake("hassanabha");
		bakery.bake("ayangar", 2);
		bakery.bake("puttu", 3, "hassan");
		bakery.bake("ravi", 4, "bengaluru", 120);
		bakery.bake("suryaputra", 5, "Mysuru", 250, 7.10f);
		System.out.println("\n");

		SmallBakery small = new SmallBakery();
		small.bake();
		small.bake("M S bakery");
		small.bake("M G bakery", 2);
		small.bake("C P bakery", 3, "Arakalgud");
		small.bake("Cinnamon", 4, "Kodagu", 150);
		small.bake("Krispy kreme", 5, "Davanagere", 250, 8.10f);
		System.out.println("\n");
		
		Hotel hotel=new Hotel();
		hotel.food();
		hotel.food("krishna");
		hotel.food("krishna","hassan" );
		hotel.food("krishna", "hassan", 2);
		hotel.food("krishna", "hassan", 3, 6.10f);
		hotel.food("krishna", "hassan", 4, 6.30f, 8030f);
		System.out.println("\n");
		
		Hotel hotel1=new VegHotel();
		hotel1.food();
		hotel1.food("krishna");
		hotel1.food("krishna","hassan" );
		hotel1.food("krishna", "hassan", 2);
		hotel1.food("krishna", "hassan", 3, 6.10f);
		hotel1.food("krishna", "hassan", 4, 6.30f, 8030f);
		System.out.println("\n");
		
		Hospital hospital=new Hospital();
		hospital.treatment();
		hospital.treatment("abc");
		hospital.treatment("abc", "hassan");
		hospital.treatment("abc", "hassan", 2);
		hospital.treatment("abc", "hassan", 3, 2500);
		hospital.treatment("abc", "hassan", 4, 2500, 7.0f);
		System.out.println("\n");
		
		Hospital hospital1=new AyurvedicHospital();
		hospital1.treatment();
		hospital1.treatment("abc");
		hospital1.treatment("abc", "hassan");
		hospital1.treatment("abc", "hassan", 2);
		hospital1.treatment("abc", "hassan", 3, 2500);
		hospital1.treatment("abc", "hassan", 4, 2500, 7.0f);
		System.out.println("\n");
		
		Hostel hostel=new Hostel();
		hostel.stay();
		hostel.stay("avs");
		hostel.stay("hab", "hassan");
		hostel.stay("asv", "hassan", 2);
		hostel.stay("abs", "hassan", 3, 6.30f);
		hostel.stay("adh", "hassan", 4, 6.30f, 7.30f);
		System.out.println("\n");
		
		Hostel hostel1=new GirlsHostel();
		hostel1.stay();
		hostel1.stay("avs");
		hostel1.stay("hab", "hassan");
		hostel1.stay("asv", "hassan", 2);
		hostel1.stay("abs", "hassan", 3, 6.30f);
		hostel1.stay("adh", "hassan", 4, 6.30f, 7.30f);
		System.out.println("\n");
		
		Mall mall=new Mall();
		mall.shop();
		mall.shop("JI");
		mall.shop("JT", "bengaluru");
		mall.shop("jT", "Bangaluru", 1);
		mall.shop("JT", "bangaluru", 1, 9.00f);
		mall.shop("JT", "bangaluru", 1, 9.00f, 10.00f);
		System.out.println("\n");
		
		Mall mall1=new RegionalMall();
		mall1.shop();
		mall1.shop("JI");
		mall1.shop("JT", "bengaluru");
		mall1.shop("jT", "Bangaluru", 1);
		mall1.shop("JT", "bangaluru", 1, 9.00f);
		mall1.shop("JT", "bangaluru", 1, 9.00f, 10.00f);
		System.out.println("\n");

		Theater theater=new Theater();
		theater.entertainment();
		theater.entertainment("hgs");
		theater.entertainment("sbds", "mysuru");
		theater.entertainment("asd", "mysuru", 2);
		theater.entertainment("shg", "mysuru", 2, 10.00f);
		theater.entertainment("sdjs", "mysuru", 4, 10.00f, 1.0f);
		System.out.println("\n");
		
		Theater theater1=new ComedyTheater();
		theater1.entertainment();
		theater1.entertainment("hgs");
		theater1.entertainment("sbds", "mysuru");
		theater1.entertainment("asd", "mysuru", 2);
		theater1.entertainment("shg", "mysuru", 2, 10.00f);
		theater1.entertainment("sdjs", "mysuru", 4, 10.00f, 1.0f);
		System.out.println("\n");
		
		Library library=new Library();
		library.store();
		library.store("state");
		library.store("state", "kodugu");
		library.store("state", "kodugu", 1);
		library.store("state", "kodagu", 2, 9.00f);
		library.store("state", "kodagu", 2, 9.00f, 7.00f);
		System.out.println("\n");
		
		Library library1=new PublicLibrary();
		library1.store();
		library1.store("state");
		library1.store("state", "kodugu");
		library1.store("state", "kodugu", 1);
		library1.store("state", "kodagu", 2, 9.00f);
		library1.store("state", "kodagu", 2, 9.00f, 7.00f);
		System.out.println("\n");
		
		Temple temple=new Temple();
		temple.prayer();
		temple.prayer("lakshmi");
		temple.prayer("lakshmi", "goravanahalli");
		temple.prayer("lakshmi", "goravanahalli", 1);
		temple.prayer("lakshmi", "goravanahalli", 1, 5.30f);
		temple.prayer("lakshmi", "goravanahalli", 1, 5.30f, 7.00f);
		System.out.println("\n");
		
		Temple temple1=new NagaraStyleTemple();
		temple1.prayer();
		temple1.prayer("lakshmi");
		temple1.prayer("lakshmi", "goravanahalli");
		temple1.prayer("lakshmi", "goravanahalli", 1);
		temple1.prayer("lakshmi", "goravanahalli", 1, 5.30f);
		temple1.prayer("lakshmi", "goravanahalli", 1, 5.30f, 7.00f);
		System.out.println("\n");
		
		Market market=new Market();
		market.selling();
		market.selling("hsa");
		market.selling("bah", "davanagere");
		market.selling("sdjah", "davanagere", 1);
		market.selling("ashg", "davangere", 2, 4.00f);
		market.selling("shdg", "davanagere", 2, 4.00f, 6.30f);
		System.out.println("\n");
		
		Market market1=new StockMarket();
		market1.selling();
		market1.selling("hsa");
		market1.selling("bah", "davanagere");
		market1.selling("sdjah", "davanagere", 1);
		market1.selling("ashg", "davangere", 2, 4.00f);
		market1.selling("shdg", "davanagere", 2, 4.00f, 6.30f);
		System.out.println("\n");
		
		Street street=new Street();
		street.movement();
		street.movement("ahj");
		street.movement("hsdg","ahd");
		street.movement("sgdh","aga",1);
		street.movement("aha","shg",2,4.00f);
		street.movement("sdh","dhsa",3,4.00f,11.30f);
		System.out.println("\n");
		
		Street street1=new AlleyStreet();
		street1.movement();
		street1.movement("ahj");
		street1.movement("hsdg","ahd");
		street1.movement("sgdh","aga",1);
		street1.movement("aha","shg",2,4.00f);
		street1.movement("sdh","dhsa",3,4.00f,11.30f);
		System.out.println("\n");
		
		Zoo zoo=new Zoo();
		zoo.exhibition();
		zoo.exhibition("sdv");
		zoo.exhibition("sxb","sha");
		zoo.exhibition("xha","xxsh",1);
		zoo.exhibition("adv","sjd",2,9.00f);
		zoo.exhibition("sdb","saw",2,9.00f,6.20f);
		System.out.println("\n");
		
		Zoo zoo1=new NationalZoo();
		zoo1.exhibition();
		zoo1.exhibition("sdv");
		zoo1.exhibition("sxb","sha");
		zoo1.exhibition("xha","xxsh",1);
		zoo1.exhibition("adv","sjd",2,9.00f);
		zoo1.exhibition("sdb","saw",2,9.00f,6.20f);
		System.out.println("\n");
		
		City city=new City();
		city.administrative();
		city.administrative("sdv");
		city.administrative("sxb","sha");
		city.administrative("xha","xxsh",1);
		city.administrative("adv","sjd",2,9.00f);
		city.administrative("sdb","saw",2,9.00f,6.20f);
		System.out.println("\n");
		
		City city1=new SmartCity();
		city1.administrative();
		city1.administrative("sdv");
		city1.administrative("sxb","sha");
		city1.administrative("xha","xxsh",1);
		city1.administrative("adv","sjd",2,9.00f);
		city1.administrative("sdb","saw",2,9.00f,6.20f);
		System.out.println("\n");
		
		Pub pub=new Pub();
		pub.drink();
		pub.drink("sdv");
		pub.drink("sxb","sha");
		pub.drink("xha","xxsh",1);
		pub.drink("adv","sjd",2,9.00f);
		pub.drink("sdb","saw",2,6.00f,11.30f);
		System.out.println("\n");
		
		Pub pub1=new GastroPubs();
		pub1.drink();
		pub1.drink("sdv");
		pub1.drink("sxb","sha");
		pub1.drink("xha","xxsh",1);
		pub1.drink("adv","sjd",2,9.00f);
		pub1.drink("sdb","saw",2,6.00f,11.30f);
		System.out.println("\n");
		
		PoliceStation police=new PoliceStation();
		police.preventsCrime();
		police.preventsCrime("sdv");
		police.preventsCrime("sxb","sha");
		police.preventsCrime("xha","xxsh",1);
		police.preventsCrime("adv","sjd",2,9.00f);
		police.preventsCrime("sdb","saw",2,9.00f,6.20f);
		System.out.println("\n");
		
		PoliceStation police1=new DistrictPoliceStation();
		police1.preventsCrime();
		police1.preventsCrime("sdv");
		police1.preventsCrime("sxb","sha");
		police1.preventsCrime("xha","xxsh",1);
		police1.preventsCrime("adv","sjd",2,9.00f);
		police1.preventsCrime("sdb","saw",2,9.00f,6.20f);
		System.out.println("\n");
	}
}
