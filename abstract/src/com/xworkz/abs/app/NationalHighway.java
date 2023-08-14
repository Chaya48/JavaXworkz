package com.xworkz.abs.app;

public class NationalHighway extends Highway {

	@Override
	public void code() {
		System.out.println("invoking code in nationalHighway");
	}

	@Override
	public void system() {
		System.out.println("invoking system in nationalHighway");
	}

	@Override
	public void patrol() {
		System.out.println("invoking patrol in nationalHighway");
	}

	@Override
	public void highwayman() {
		System.out.println("invoking highwayman in nationalHighway");
	}

	@Override
	public void signal() {
		System.out.println("invoking signal in nationalHighway");

	}

}
