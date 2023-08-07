package com.xworkz.methods.boot;

import com.xworkz.methods.app.Mouse;

public class MouseRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in mouse Runner");
		
		Mouse mouse=new Mouse();
		mouse.move();
		mouse.move("hp");
		mouse.move(550);
		mouse.move("Dell", 768);
	}

}
