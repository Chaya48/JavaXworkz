package com.xworkz.abstact.app;

public class Mobile {

	private Camara camara;

	public void capture() {
		System.out.println("invoking capture in mobile");
		this.camara.capture();
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}
}
