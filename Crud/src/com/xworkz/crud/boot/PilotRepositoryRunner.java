package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PilotRepository;
import com.xworkz.crud.app.repository.PilotRepositoryImpl;

public class PilotRepositoryRunner {

	public static void main(String[] args) {
System.out.println("invoking main in PilotRepositoryRunner");

PilotRepository pilot=new PilotRepositoryImpl();
pilot.transpotingPassengers("charles");
pilot.transpotingPassengers("nesha");
pilot.transpotingPassengers("annie");
pilot.transpotingPassengers("sushant");
pilot.transpotingPassengers("sarthak");
pilot.transpotingPassengers("vignesh");
pilot.transpotingPassengers("anita");
pilot.transpotingPassengers("prasanna");
pilot.transpotingPassengers("akashMahna");
pilot.transpotingPassengers("payalAgarawal");
pilot.transpotingPassengers("prajkta");

	}

}
