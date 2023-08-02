package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.three.Aloe;
import com.xworkz.app.boot.inheritance.three.Fern;
import com.xworkz.app.boot.inheritance.three.Moss;
import com.xworkz.app.boot.inheritance.three.Plants;

public class PlantsRunner {

	public static void main(String[] args) {

		Plants plant=new Plants();
		plant.plantMethod();
		System.out.println("\n");
		
		Plants moss=new Moss();
		Moss moss1=new Moss();
		moss.plantMethod();
		moss1.mossMethos();
		System.out.println("\n");
		
		Plants fern=new Fern();
		Moss fern1=new Fern();
		Fern fern2=new Fern();
		fern.plantMethod();
		fern1.mossMethos();
		fern2.fernMethod();
		System.out.println("\n");
		
		Plants aloe=new Aloe();
		Moss aloe1=new Aloe();
		Fern aloe2=new Aloe();
		Aloe aloe3=new Aloe();
		aloe.plantMethod();
		aloe1.mossMethos();
		aloe2.fernMethod();
		aloe3.aloeMethod();
	}

}
