package com.xworkz.chaining.boot;

import com.xworkz.chaining.app.Diamond;
import com.xworkz.chaining.app.SyntheticDiamond;

public class DiamondRunner {

	public static void main(String[] args) {

		Diamond diamond=new Diamond(14975,"Cubic","Colorless",0.004);
		System.out.println(diamond.price);
		System.out.println(diamond.crystalSystem);
		System.out.println(diamond.streak);
		System.out.println(diamond.disersion);
		System.out.println("\n");
		
		SyntheticDiamond synthetic=new SyntheticDiamond();
		System.out.println(synthetic.price);
		System.out.println(synthetic.crystalSystem);
		System.out.println(synthetic.streak);
		System.out.println(synthetic.disersion);
		System.out.println("\n");
		
		SyntheticDiamond synthetic1=new SyntheticDiamond(3999,"cubic","colorless",0.004);
		System.out.println(synthetic1.price);
		System.out.println(synthetic1.crystalSystem);
		System.out.println(synthetic1.streak);
		System.out.println(synthetic1.disersion);
		System.out.println("\n");
	}

}
