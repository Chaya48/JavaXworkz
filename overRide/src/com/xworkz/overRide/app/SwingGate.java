package com.xworkz.overRide.app;

public class SwingGate extends Gate {

	public SwingGate() {
		System.out.println("invoking no-args in SwingGate");
	}

	@Override
	public void open() {
		System.out.println("invoking open in SwingGate");
	}
}
