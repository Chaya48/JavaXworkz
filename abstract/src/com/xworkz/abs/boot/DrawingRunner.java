package com.xworkz.abs.boot;

import com.xworkz.abs.app.Drawing;
import com.xworkz.abs.app.ShadingDrawing;

public class DrawingRunner {

	public static void main(String[] args) {

		Drawing drawing=new ShadingDrawing();
		drawing.draw();
		drawing.eraser();
		drawing.pencialMethod();
		drawing.perspectiveMethod();
		drawing.hatching();
		drawing.stipplingMethod();
		drawing.sketchMethod();
		drawing.gestureMethod();
		drawing.contourMethod();
		drawing.tonalMethod();
	}

}
