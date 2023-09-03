package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.GroceryRepository;
import com.xworkz.crud.app.repository.GroceryRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in groceryRunner");

		GroceryRepository repository = new GroceryRepositoryImpl();
		repository.Save("Sugar");
		repository.Save("Salt");
		repository.Save("Rice");
		repository.Save("Oil");
		repository.Save("Rava");
		repository.Save("Jeera");
		repository.Save("Dal");
		repository.Save("Onion");
		repository.Save("Tamoto");
		repository.Save("Chilli");
		repository.Save("chilli");
	}

}
