package com.xworkz.methods.boot;

import com.xworkz.methods.app.Gadget;

public class GadgetRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in Gadget Runner");
		
		Gadget gadget=new Gadget();
		gadget.calling();
		gadget.calling("Mobile");
		gadget.calling(25000);
		gadget.calling("watch", 1999);
	}
}
