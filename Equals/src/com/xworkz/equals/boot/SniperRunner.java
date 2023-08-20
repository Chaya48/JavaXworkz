package com.xworkz.equals.boot;

import com.xworkz.equals.app.Sniper;

public class SniperRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Sniper Runner");
		Sniper sniper = new Sniper("modern", 5.0f, 56, "expert training", 5, "Expert spotter");
		Sniper sniper2 = new Sniper("modern", 5.0f, 56, "expert training", 5, "Expert spotter");
		boolean ref = sniper.equals(sniper2);

	}

}
