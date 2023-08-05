package com.xworkz.chaining.boot;

import com.xworkz.chaining.app.Router;
import com.xworkz.chaining.app.WirelessRouter;

public class RouterRunner {

	public static void main(String[] args) {
	
		System.out.println("invoking main in router runner");
		
		Router router=new Router("D-link","D-link 615",798,"black");
		System.out.println(router.brand);
		System.out.println(router.modelName);
		System.out.println(router.price);
        System.out.println(router.color);
        System.out.println("\n");
        
        WirelessRouter wireless=new WirelessRouter();
        System.out.println(wireless.brand);
        System.out.println(wireless.modelName);
        System.out.println(wireless.price);
        System.out.println(wireless.color);
        System.out.println("\n");
        
        WirelessRouter wireless1=new WirelessRouter("TP-link","Archer C50",1847,"white");
        System.out.println(wireless1.brand);
        System.out.println(wireless1.modelName);
        System.out.println(wireless1.price);
        System.out.println(wireless1.color);
        System.out.println("\n");
	}

}
