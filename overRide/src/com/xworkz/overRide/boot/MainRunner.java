package com.xworkz.overRide.boot;

import com.xworkz.overRide.app.AirlineTicket;
import com.xworkz.overRide.app.Amoeba;
import com.xworkz.overRide.app.Bangle;
import com.xworkz.overRide.app.BassDrum;
import com.xworkz.overRide.app.BestCoal;
import com.xworkz.overRide.app.BrainEatingAmoeba;
import com.xworkz.overRide.app.Coal;
import com.xworkz.overRide.app.ComedyTheater;
import com.xworkz.overRide.app.Dinosaur;
import com.xworkz.overRide.app.Drum;
import com.xworkz.overRide.app.DynamicMic;
import com.xworkz.overRide.app.Flex;
import com.xworkz.overRide.app.Gate;
import com.xworkz.overRide.app.GoldBangle;
import com.xworkz.overRide.app.Mic;
import com.xworkz.overRide.app.RollingFlex;
import com.xworkz.overRide.app.SwingGate;
import com.xworkz.overRide.app.Theater;
import com.xworkz.overRide.app.Ticket;
import com.xworkz.overRide.app.VelociraptorDinosaur;

public class MainRunner {

	public static void main(String[] args) {

		Coal coal = new BestCoal();
		coal.burn();
		System.out.println("\n");
		
		Amoeba amoeba=new BrainEatingAmoeba();
		amoeba.movementOfCells();
		System.out.println("\n");
		
		Bangle bangle=new GoldBangle();
		bangle.sound();
		System.out.println("\n");
		
		Gate gate=new SwingGate();
		gate.open();
		System.out.println("\n");
		
		Dinosaur dinosaur=new VelociraptorDinosaur();
		dinosaur.eating();
		System.out.println("\n");
		
		Flex flex=new RollingFlex();
		flex.showing();
		System.out.println("\n");
		
		Mic mic=new DynamicMic();
		mic.translate();
		System.out.println("\n");
		
		Drum drum=new BassDrum();
		drum.storing();
		System.out.println("\n");
		
		Theater theater=new ComedyTheater();
		theater.entertainment();
		System.out.println("\n");
		
		Ticket ticket=new AirlineTicket();
		ticket.booking();
		System.out.println("\n");
	}

}
