package com.xworkz.chaining.boot;

import com.xworkz.chaining.app.GolfGround;
import com.xworkz.chaining.app.Ground;

public class GroundRunner {

 public static void main(String[] args) {
	 
	 Ground ground=new Ground("East west cricket ground",7f,7.30f,"BEL layout");
	 System.out.println(ground.name);
	 System.out.println(ground.open);
	 System.out.println(ground.close);
	 System.out.println(ground.location);
	 System.out.println("\n");
	 
	 GolfGround golf=new GolfGround();
	 System.out.println(golf.name);
	 System.out.println(golf.open);
	 System.out.println(golf.close);
	 System.out.println(golf.location);
	 System.out.println("\n");
	 
	 GolfGround golf1=new GolfGround("Bengaluru Golf Club",7.30f,11.30f,"Sampangiram Nagar");
	 System.out.println(golf1.name);
	 System.out.println(golf1.open);
	 System.out.println(golf1.close);
	 System.out.println(golf1.location);
	 System.out.println("\n");
 }
}
