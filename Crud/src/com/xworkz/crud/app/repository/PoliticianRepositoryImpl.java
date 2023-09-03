package com.xworkz.crud.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository {
	
	private String[] politician = new String[TOTAL_NAMES];
	private int position;

	@Override
	public void socialization(String politician) {
		System.out.println("invoking socialization in politician");
		if (this.position < TOTAL_NAMES) {
			this.politician[position]=politician;
			System.out.println("politician name is " + politician + " in position " + this.position);
			this.position++;
		}
		else {
			System.err.println("item is exdes more than list");
		}
	}

}
