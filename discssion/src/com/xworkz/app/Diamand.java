package com.xworkz.app;

public class Diamand implements ParentOne,ParentTwo{

	@Override
	public void fun() {	

		System.out.println("implent");
	}
	
	public static void main(String[] args) {
		
		Diamand diamand=new Diamand();
		diamand.fun();
	}

}
