package com.xworkz.crud.app.repository;

public class PilotRepositoryImpl implements PilotRepository {

	private String[] pilot = new String[TOTAL_NAMES];
	private int position;

	@Override
	public void transpotingPassengers(String pilot) {
		System.out.println("invoking transpotingPassengers in pilot");
		if (this.position < TOTAL_NAMES) {
			this.pilot[position] = pilot;
			System.out.println("pilots name is " + pilot + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("item is exdes more than list");
		}
	}

}
