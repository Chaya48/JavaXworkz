package com.xworkz.abs.app;

public abstract  class Drawing {

	public void draw() {
		System.out.println("invoking draw in Drawing");
	}
	public void eraser() {
		System.out.println("invoking eraser in Drawing");
	}
	public void pencialMethod() {
		System.out.println("invoking pencialMethod in Drawing");
	}
	public void perspectiveMethod() {
		System.out.println("invoking perspectiveMethod in Drawing");
	}
	public void hatching() {
		System.out.println("invoking hathing in Drawing");
	}
	public abstract void stipplingMethod();
	public abstract void sketchMethod();
	public abstract void gestureMethod();
	public abstract void contourMethod();
	public abstract void tonalMethod();
}
