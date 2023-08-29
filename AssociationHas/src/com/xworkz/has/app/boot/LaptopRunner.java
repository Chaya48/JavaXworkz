package com.xworkz.has.app.boot;

import com.xworkz.has.app.Laptops;

public class LaptopRunner {

	public static void main(String[] args) {
System.out.println("invoking main in LaptopRunner");

String brand="Lenovo";
Processor processor=new Processor();
Laptops laptops=new Laptops(brand);
laptops.setProcessor(processor);
laptops.typing();
System.out.println("\n");
laptops.game();
System.out.println("\n");
laptops.paint();
System.out.println("\n");
laptops.watchingMove();
	}

}
