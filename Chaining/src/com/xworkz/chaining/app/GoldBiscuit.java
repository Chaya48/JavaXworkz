package com.xworkz.chaining.app;

public class GoldBiscuit extends Gold {

	public GoldBiscuit() {
		super(5400.00,"Au",79,1064l);
		System.out.println("invoking no-args constructor in goldBiscuit");
	}
	
	public GoldBiscuit(double price, String symbol, int atomicNumber, long meltingPoint) {
		super(price,symbol,atomicNumber,meltingPoint);
		System.out.println("invoking double,string,int,long constructor in goldBiscuit");
	}
}
