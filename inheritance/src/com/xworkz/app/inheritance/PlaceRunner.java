package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.four.Country;
import com.xworkz.app.boot.inheritance.four.District;
import com.xworkz.app.boot.inheritance.four.Places;
import com.xworkz.app.boot.inheritance.four.States;
import com.xworkz.app.boot.inheritance.four.Taluk;

public class PlaceRunner {

	 public static void main(String[] args) {
		 
		 Places place=new Places();
		 place.placesMethod();
		 System.out.println("\n");
		 
		 Places country=new Country();
		 Country country1=new Country();
		 country.placesMethod();
		 country1.countryMethod();
		 System.out.println("\n");
		 
		 Places state=new States();
		 Country state1=new States();
		 States state2=new States();
		 state.placesMethod();
		 state1.countryMethod();
		 state2.statesMethod();
		 System.out.println("\n");
		 
		 Places district=new District();
		 Country district1=new District();
		 States district2=new District();
		 District district3=new District();
		 district.placesMethod();
		 district1.countryMethod();
		 district2.statesMethod();
		 district3.districtMethod();
		 System.out.println("\n");
		 
		 Places taluk=new Taluk();
		 Country taluk1=new Taluk();
		 States taluk2=new Taluk();
		 District taluk3=new Taluk();
		 Taluk taluk4=new Taluk();
		 taluk.placesMethod();
		 taluk1.countryMethod();
		 taluk2.statesMethod();
		 taluk3.districtMethod();
		 taluk4.talukMethod();
	 }
}
