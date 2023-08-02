package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.two.Chilli;
import com.xworkz.app.boot.inheritance.two.Tamoto;
import com.xworkz.app.boot.inheritance.two.Vegitables;

public class VegitableRunner {

	public static void main(String[] args) {
		
		Vegitables vegitable=new Vegitables();
		vegitable.vegitableMethod();
		System.out.println("\n");
		
		Vegitables tamoto=new Tamoto();
		Tamoto tamoto1=new Tamoto();
		tamoto.vegitableMethod();
		tamoto1.tamotoMethod();
		System.out.println("\n");
		
		Vegitables chilli=new Chilli();
		Tamoto chilli1=new Chilli();
		Chilli chilli2=new Chilli();
        chilli.vegitableMethod();
        chilli1.tamotoMethod();
        chilli2.chilliMethod();
	}

}
