package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Laptop;
import com.xworkz.abstact.app.Processor;
import com.xworkz.abstact.app.impl.HpLaptop;
import com.xworkz.abstact.app.impl.LenovaLaptop;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in laptopRunner");
		Processor processor = new LenovaLaptop();
		Processor processor2 = new HpLaptop();

		Laptop laptop = new Laptop();
		laptop.setProcessor(processor2);
		laptop.fetch();
	}

}
