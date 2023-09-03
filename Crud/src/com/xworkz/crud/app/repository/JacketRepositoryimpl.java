package com.xworkz.crud.app.repository;

public class JacketRepositoryimpl implements JacketRepository {
	
	private String[] jacket = new String[TOTAL_JACKET];
	private int position;

	@Override
	public void cover(String jacket) {
		System.out.println("invoking cover in jacket");
		if (this.position < TOTAL_JACKET) {
			this.jacket[position]=jacket;
			System.out.println("jacket name is " + jacket + " in position " + this.position);
			this.position++;
		}
		else {
			System.err.println("item is exdes more than list");
		}
	}

}
