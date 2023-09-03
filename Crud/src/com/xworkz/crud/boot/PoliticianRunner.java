package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PoliticianRepository;
import com.xworkz.crud.app.repository.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianRunner");
		
	PoliticianRepository politician=new PoliticianRepositoryImpl();
	politician.socialization("DeveGowda");
	politician.socialization("Narendra Modhi");
	politician.socialization("KumarSwami");
	politician.socialization("BasavarajBommai");
	politician.socialization("Siddaramya");
	politician.socialization("DKShivakumar");
	politician.socialization("BSYediyurappa");
	politician.socialization("JagadishShettar");
	politician.socialization("SadanandaGowda");
	politician.socialization("JHPatil");
	politician.socialization("Bangarappa");
	politician.socialization("RahulGandhi");

	
	}

}
