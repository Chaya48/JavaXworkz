package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app3.NationalZoo;
import com.xworkz.inheritance.app3.StateZoo;
import com.xworkz.inheritance.app3.Zoo;
import com.xworkz.inheritance.util.ZooUtil;

public class ZooRunner {

	public static void main(String[] args) {

              Zoo zoo=new Zoo();
		
		StateZoo stateZoo=new StateZoo();
		
		NationalZoo nationalZoo=new NationalZoo();
		
		ZooUtil util=new ZooUtil();
		System.out.println("Calling run method with zoo ref");
		util.run(zoo);
		System.out.println("---------------------------------");
		
		ZooUtil util2=new ZooUtil();
		System.out.println("Calling run method with State zoo ref");
		util2.run(stateZoo);
		System.out.println("---------------------------------");
		
		ZooUtil util3=new ZooUtil();
		System.out.println("Calling run method with National zoo ref");
		util3.run(nationalZoo);
		System.out.println("---------------------------------");

	}

}
