package com.xworkz.has.app.boot;

import com.xworkz.has.app.Laptop;
import com.xworkz.has.app.Trainer;

public class TrainerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in trainerRunner");
		String name = "om";
		Laptop laptop = new Laptop();

		Trainer trainer = new Trainer(name);
		trainer.setLaptop(laptop);
		trainer.teach();
		
	}

}
