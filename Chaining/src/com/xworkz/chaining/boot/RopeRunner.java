package com.xworkz.chaining.boot;

import com.xworkz.chaining.app.Rope;
import com.xworkz.chaining.app.SyntheticRope;

public class RopeRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in rope runner");
		
		Rope rope=new Rope("cotton","white",950,"saifpro");
		System.out.println(rope.material);
		System.out.println(rope.color);
		System.out.println(rope.price);
		System.out.println(rope.manufacturer);
		System.out.println("\n");
		
		SyntheticRope synthetic=new SyntheticRope();
		System.out.println(synthetic.material);
		System.out.println(synthetic.color);
		System.out.println(synthetic.price);
		System.out.println(synthetic.manufacturer);
		System.out.println("\n");
		
		SyntheticRope synthetic1=new SyntheticRope("Synthetic","red",110,"labdhi");
		System.out.println(synthetic1.material);
		System.out.println(synthetic1.color);
		System.out.println(synthetic1.price);
		System.out.println(synthetic1.manufacturer);
		System.out.println("\n");
	}

}
