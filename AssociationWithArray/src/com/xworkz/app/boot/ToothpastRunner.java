package com.xworkz.app.boot;

import com.xworkz.app.Company;
import com.xworkz.app.Ingredent;
import com.xworkz.app.Toothpaste;

public class ToothpastRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in toothpast runner");
		String name="colgate";
		String brand="colgate";
       Company company=new Company("colgate","puttu","India");
       Ingredent ingredent1=new Ingredent("Sorbito",45,76f);
       Ingredent ingredent2=new Ingredent("vedha",54,87f);
       Ingredent ingredent3=new Ingredent("sulfate",87,77f);
       Ingredent ingredent4=new Ingredent("cellilose",76,98f);
       Ingredent ingredent5=new Ingredent("jell",87,98f);
       Ingredent[] ingredents= {ingredent1,ingredent2,ingredent3,ingredent4,ingredent5};
		Toothpaste toothpaste=new Toothpaste(name,brand,company,ingredents);
		toothpaste.printInfo();
		company.printInfo();
	}
}

