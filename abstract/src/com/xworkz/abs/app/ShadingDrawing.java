package com.xworkz.abs.app;

public class ShadingDrawing extends Drawing {

	@Override
	public void stipplingMethod() {
		System.out.println("invoking stipplingMethod in ShadingDrawing");
	}

	@Override
	public void sketchMethod() {
		System.out.println("invoking sketchMethod in ShadingDrawing");
	}

	@Override
	public void gestureMethod() {
		System.out.println("invoking gestureMethod in ShadingDrawing");
	}

	@Override
	public void contourMethod() {
		System.out.println("invoking contourMethod in ShadingDrawing");
	}

	@Override
	public void tonalMethod() {
		System.out.println("invoking tonalMethod in ShadingDrawing");
	}

}
