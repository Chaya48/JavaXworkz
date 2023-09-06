package com.xworkz.crud.app.repository;

public class TrainNoRepositoryImpl implements TrainNoRepository {

	private String[] juices = new String[TOTAL_NUMBERS];
	private int position = 0;

	@Override
	public void identify(String train) {

		System.out.println("invoking store in JuiceRepositoryImpl");
		if (position < TOTAL_NUMBERS) {
			this.juices[position] = train;
			System.out.println("train number is  : " + train + "position :" + this.position);
			this.position++;
		}
	}

	@Override
	public boolean isExist(String train) {
		for (int index = 0; index <= this.position; index++) {
			String temp = this.juices[index];
			if (temp != null && temp.equals(train)) {
				System.err.println("juice is already exit plese select another");
				return true;
			}
		}
		return false;
	}
}
