package com.xworkz.app.boot;

import com.xworkz.app.clas.Public;
import com.xworkz.app.intf.MetroRules;

public class MetroRunner {
public static void main(String[] args) {
	System.out.println("Invoking main in metro runner");
	MetroRules metro = new Public();
	metro.ticket("By govt");
	metro.price("Coins for travel");
	metro.ticket("Tickets by counter");
}
}
