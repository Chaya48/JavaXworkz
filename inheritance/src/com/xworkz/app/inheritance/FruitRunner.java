package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.seven.Apple;
import com.xworkz.app.boot.inheritance.seven.Banana;
import com.xworkz.app.boot.inheritance.seven.Fruit;
import com.xworkz.app.boot.inheritance.seven.Kiwi;
import com.xworkz.app.boot.inheritance.seven.Mango;
import com.xworkz.app.boot.inheritance.seven.Orange;
import com.xworkz.app.boot.inheritance.seven.Papaya;
import com.xworkz.app.boot.inheritance.seven.Pineapple;

public class FruitRunner {

	public static void main(String[] args) {
		
		Fruit fruit=new Fruit();
		fruit.fruitMethod();
		System.out.println("\n");
		
		Fruit apple=new Apple();
		Apple apple1=new Apple();
		apple.fruitMethod();
		apple1.appleMethod();
		System.out.println("\n");
		
		Fruit pineapple=new Pineapple();
		Apple pineapple1=new Pineapple();
		Pineapple pineapple2=new Pineapple();
		pineapple.fruitMethod();
		pineapple1.appleMethod();
		pineapple2.pineappleMethod();
		System.out.println("\n");
		
		Fruit banana=new Banana();
        Apple banana1=new Banana();
        Pineapple banana2=new Banana();
        Banana banana3=new Banana();
        banana.fruitMethod();
        banana1.appleMethod();
        banana2.pineappleMethod();
        banana3.bananaMethod();
        System.out.println("\n");
        
        Fruit orange=new Orange();
        Apple orange1=new Orange();
        Pineapple orange2=new Orange();
        Banana orange3=new Orange();
        Orange orange4=new Orange();
        orange.fruitMethod();
        orange1.appleMethod();
        orange2.pineappleMethod();
        orange3.bananaMethod();
        orange4.orangeMethod();
        System.out.println("\n");
        
        Fruit mango=new Mango();
        Apple mango1=new Mango();
        Pineapple mango2=new Mango();
        Banana mango3=new Mango();
        Orange mango4=new Mango();
        Mango mango5=new Mango();
        mango.fruitMethod();
        mango1.appleMethod();
        mango2.pineappleMethod();
        mango3.bananaMethod();
        mango4.orangeMethod();
        mango5.mangoMethod();
        System.out.println("\n");
        
        Fruit papaya=new Papaya();
        Apple papaya1=new Papaya();
        Pineapple papaya2=new Papaya();
        Banana papaya3=new Papaya();
        Orange papaya4=new Papaya();
        Mango papaya5=new Papaya();
        Papaya papaya6=new Papaya();
        papaya.fruitMethod();
        papaya1.appleMethod();
        papaya2.pineappleMethod();
        papaya3.bananaMethod();
        papaya4.orangeMethod();
        papaya5.mangoMethod();
        papaya6.papyaMethod();
        System.out.println("\n");
        
        Fruit kiwi=new Kiwi();
        Apple kiwi1=new Kiwi();
        Pineapple kiwi2=new Kiwi();
        Banana kiwi3=new Kiwi();
        Orange kiwi4=new Kiwi();
        Mango kiwi5=new Kiwi();
        Papaya kiwi6=new Kiwi();
        Kiwi kiwi7=new Kiwi();
        kiwi.fruitMethod();
        kiwi1.appleMethod();
        kiwi2.pineappleMethod();
        kiwi3.bananaMethod();
        kiwi4.orangeMethod();
        kiwi5.mangoMethod();
        kiwi6.papyaMethod();
        kiwi7.kiwiMethod();
        System.out.println("\n");
	}

}
