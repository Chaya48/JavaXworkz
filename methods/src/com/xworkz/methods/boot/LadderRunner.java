package com.xworkz.methods.boot;

import com.xworkz.methods.app.Ladder;

public class LadderRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in ladderRunner");
		
		Ladder ladder=new Ladder();
		ladder.fold();
		ladder.fold(8);
		ladder.fold(30);
		ladder.fold(7, 15);
	}

}
