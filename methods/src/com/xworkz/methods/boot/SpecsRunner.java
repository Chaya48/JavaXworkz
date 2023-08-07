package com.xworkz.methods.boot;

import com.xworkz.methods.app.Specs;

public class SpecsRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in Specs");
		
		Specs specs=new Specs();
		specs.seeing();
		specs.seeing(600);
		specs.seeing("Square");
		specs.seeing(700, "PlainFrame");
	}

}
