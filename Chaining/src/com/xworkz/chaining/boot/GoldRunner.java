package com.xworkz.chaining.boot;

import com.xworkz.chaining.app.Gold;
import com.xworkz.chaining.app.GoldBiscuit;

public class GoldRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in goldRunner");
		
		Gold gold=new Gold(5400,"Au",79,1064l);
		System.out.println(gold.price);
		System.out.println(gold.symbol);
		System.out.println(gold.atomicNumber);
		System.out.println(gold.meltingPoint);
		System.out.println("\n");
		
		GoldBiscuit biscuit=new GoldBiscuit();
		System.out.println(biscuit.price);
		System.out.println(biscuit.symbol);
		System.out.println(biscuit.atomicNumber);
		System.out.println(biscuit.meltingPoint);
		System.out.println("\n");
			
		GoldBiscuit biscuit1=new GoldBiscuit(647983,"Au",79,1064l);
		System.out.println(biscuit1.price);
		System.out.println(biscuit1.symbol);
		System.out.println(biscuit1.atomicNumber);
		System.out.println(biscuit1.meltingPoint);
		System.out.println("\n");	
			
		}
	}


