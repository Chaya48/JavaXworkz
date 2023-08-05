package com.xworkz.chaining.app;

public class SyntheticDiamond extends Diamond{

	public SyntheticDiamond() {
		super(14975,"Cubic","Colorless",0.044);
		System.out.println("invoking no-args constructor in SyntheticDiamond ");
	}
	
	public SyntheticDiamond(double price,String crystalSystem,String streak,double dispersion) {
		super(price,crystalSystem,streak,dispersion);
		System.out.println("invoking double,String,String,double constroctor in Synthetic Diamond");
	}
}
