package com.xworkz.toString.boot;

import com.xworkz.toString.app.Cave;
import com.xworkz.toString.app.Flag;
import com.xworkz.toString.app.Karchief;
import com.xworkz.toString.app.Logo;
import com.xworkz.toString.app.Pendant;

public class Runner {

	public static void main(String[] args) {

		Logo logo = new Logo();
		System.out.println(logo);
		System.out.println("\n");

		Logo logo1 = new Logo("Black", 10, 15, "Rectangle", 5);
		System.out.println(logo1);
		System.out.println("\n");

		Logo logo2 = new Logo("yellow", 15, 20, "Round", 7);
		System.out.println(logo2);
		System.out.println("\n");
		System.out.println("==========================================================");

		Karchief karchief = new Karchief();
		System.out.println(karchief);
		System.out.println("\n");

		Karchief karchief2 = new Karchief("Jockey", "Hand Karchief", "Black", 255, 20, true, true);
		System.out.println(karchief2);
		System.out.println("\n");

		Karchief karchief3 = new Karchief("Allen Solley", "Face Karchief", "white", 155, 40, true, false);
		System.out.println(karchief3);
		System.out.println("\n");
		System.out.println("==========================================================");

		Flag flag = new Flag();
		System.out.println(flag);
		System.out.println("'\n");

		Flag flag2 = new Flag("Orange,white,green", 4, true);
		System.out.println(flag2);
		System.out.println("\n");

		Flag flag3 = new Flag("white,green", 2, false);
		System.out.println(flag3);
		System.out.println("\n");
		System.out.println("==========================================================");

		Cave cave=new Cave();
		System.out.println(cave);
		System.out.println("\n");
		
		Cave cave2=new Cave("Crystal Gotto", "Bangalore", "LimeStone", "StandAlone", 120.3, 110.1, 320, 1500, false, false);
		System.out.println(cave2);
		System.out.println("\n");
		
		Cave cave3=new Cave("DarkWater","South East", "Ice cave", "StandAlone", 80.3, 100.5, 550, 1800, true, false);
		System.out.println(cave3);
		System.out.println("\n");
		System.out.println("==========================================================");

		Pendant pendant=new Pendant();
		System.out.println(pendant);
		System.out.println("\n");
		
		Pendant pendant2=new Pendant("Eternal Blossem", "18K Gold", "Filigree Swirls", "Aqua Blue", "Emerald", "Rolo Chain", 5, 30, 100000f, "Birthday", "India", "Chaya");
		System.out.println(pendant2);
		System.out.println("\n");
		
		Pendant pendant3=new Pendant("Mystic Gem", "Rose Gold", "Ancient Symbols", "Blue", "Opal", "Figaro Chain", 7, 10, 300000f, "Wedding", "Japan", "Jeevi");
		System.out.println(pendant3);
		System.out.println("\n");
	}
}
