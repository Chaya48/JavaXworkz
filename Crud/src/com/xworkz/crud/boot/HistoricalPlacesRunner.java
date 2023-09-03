package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.HistoricalPlacesRepository;
import com.xworkz.crud.app.repository.HistoricalPlacesRepositoryImpl;

public class HistoricalPlacesRunner {

	public static void main(String[] args) {
System.out.println("invoking main in HistoricalPlacesRunner");

HistoricalPlacesRepository place=new HistoricalPlacesRepositoryImpl();
place.visiting("Beluru");
place.visiting("Halebidu");
place.visiting("hampi");
place.visiting("mysure");
place.visiting("bijapur");
place.visiting("badami");
place.visiting("srirangapattana");
place.visiting("Aihole");
place.visiting("talakadu");
place.visiting("melukote");
place.visiting("pattadakal");

	}

}
