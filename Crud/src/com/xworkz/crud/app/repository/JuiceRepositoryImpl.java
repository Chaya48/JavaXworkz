package com.xworkz.crud.app.repository;

public class JuiceRepositoryImpl implements JuiceRepository {

	private String[] juices = new String[TOTAL_ITEM];
	private int position = 0;

	@Override
	public void store(String juice) {

		System.out.println("invoking store in JuiceRepositoryImpl");
		if (position < TOTAL_ITEM) {
			this.juices[position] = juice;
			System.out.println("item : " + juice + "position :" + this.position);
			this.position++;
		}
	}

	@Override
	public boolean isExist(String juice) {
		for (int index = 0; index <= this.position; index++) {
			String temp = this.juices[index];
			if (temp != null && temp.equals(juice)) {
				System.err.println("juice is already exit plese select another");
				return true;
			}
		}
		return false;
	}

}
