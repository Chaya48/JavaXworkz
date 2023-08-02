package com.xworkz.app.boot.inheritance.eight;

public class WebCamara extends Projector {

	public String clarity="good";
	
	public WebCamara() {
		System.out.println("default constructor in web camara");
	}
	
	public void webcamaraMethod() {
		System.out.println("running in web camra method");
		System.out.println("webcamara clarity is "+clarity);
	}
}
