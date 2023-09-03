package com.xworkz.crud.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {

	private String[] grocery = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void Save(String grocery) {
		System.out.println("invoking save in GroceryRepositoryImpl");
		if (this.position < TOTAL_ITEMS) {
			this.grocery[position]=grocery;
			System.out.println("Items " + grocery + " in position " + this.position);
			this.position++;
		}
		else {
			System.err.println("item is exdes more than list");
		}
	}
}
