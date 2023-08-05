package com.xworkz.chaining.app;

public class Gold {

	public double price;
	public String symbol;
	public int atomicNumber;
	public long meltingPoint;
	
	public Gold(double price, String symbol, int atomicNumber, long meltingPoint) {
		System.out.println("invoking double,string,int,short constructor in gold");
		this.price=price;
		this.symbol=symbol;
		this.atomicNumber=atomicNumber;
		this.meltingPoint=meltingPoint;
	}
}
