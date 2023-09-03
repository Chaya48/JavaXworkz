package com.xworkz.crud.app.repository;

public class ArtistRepositoryImpl implements ArtistRepository {
	
	private String[] artist = new String[TOTAL_NAMES];
	private int position;


	@Override
	public void performance(String artist) {
		System.out.println("invoking performance in ArtistRepositoryImpl");
		if (this.position < TOTAL_NAMES) {
			this.artist[position]=artist;
			System.out.println("artist names " + artist + " in position " + this.position);
			this.position++;
		}
		else {
			System.err.println("item is exdes more than list");
		}
	}

}
