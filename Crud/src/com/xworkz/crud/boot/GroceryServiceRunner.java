package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.GroceryRepository;
import com.xworkz.crud.app.repository.GroceryRepositoryImpl;
import com.xworkz.crud.app.service.GroceryService;
import com.xworkz.crud.app.service.GroceryServiceImpl;

public class GroceryServiceRunner {


		public static void main(String[] args) {
			System.out.println("Invoking main in GroceryServiceRunner");
			GroceryRepository groceryRepository = new GroceryRepositoryImpl();
			GroceryService groceryService = new GroceryServiceImpl(groceryRepository);
			groceryService.validate("Rice");
			groceryService.validate("sugar");

		}
	}


