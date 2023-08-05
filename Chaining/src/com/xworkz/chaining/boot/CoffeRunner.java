package com.xworkz.chaining.boot;

import com.xworkz.chaining.app.CappuccinoCoffe;
import com.xworkz.chaining.app.Coffe;

public class CoffeRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in coffeRunner");
		
		Coffe coffe=new Coffe(250,50,"brown",true);
		System.out.println(coffe.price);
		System.out.println(coffe.quantity);
		System.out.println(coffe.color);
		System.out.println(coffe.tasty);
		System.out.println("\n");
		
		CappuccinoCoffe cappuccino=new CappuccinoCoffe();
		System.out.println(cappuccino.price);
		System.out.println(cappuccino.quantity);
		System.out.println(cappuccino.color);
		System.out.println(cappuccino.tasty);
		System.out.println("\n");
		
		CappuccinoCoffe cappuccino1=new CappuccinoCoffe(165,100,"brown",true);
		System.out.println(cappuccino1.price);
		System.out.println(cappuccino1.quantity);
		System.out.println(cappuccino1.color);
		System.out.println(cappuccino1.tasty);
		System.out.println("\n");
	}

}
