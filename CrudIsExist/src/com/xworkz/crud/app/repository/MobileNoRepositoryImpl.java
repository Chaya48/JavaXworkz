package com.xworkz.crud.app.repository;

public class MobileNoRepositoryImpl implements MobileNoRepository {
	private long[] numbers = new long[TOTAL_NUMBERS];
	private int position = 0;

	@Override
	public void identify(long number) {

		System.out.println("invoking store in JuiceRepositoryImpl");
		if (position < TOTAL_NUMBERS) {
			this.numbers[position] = number;
			System.out.println("item : " + number + "position :" + this.position);
			this.position++;
		}
	}

	@Override
	public boolean isExist(long number) {
		for (int index = 0; index <= this.position; index++) {
			long temp = this.numbers[index];
			if (temp != 0 && temp==(number)) {
				System.err.println("juice is already exit plese select another");
				return true;
			}
		}
		return false;
	}

}
