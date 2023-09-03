package com.xworkz.crud.app.repository;

public class HistoricalPlacesRepositoryImpl implements HistoricalPlacesRepository {

	private String[] places = new String[TOTAL_PLACES];
	private int position;

	@Override
	public void visiting(String places) {
		System.out.println("invoking visiting in historicalPlaces");
		if (this.position < TOTAL_PLACES) {
			this.places[position] = places;
			System.out.println("places name is " + places + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("item is exdes more than list");
		}
	}

}
