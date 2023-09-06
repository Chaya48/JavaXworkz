package com.xworkz.crud.app.repository;

public class LocationRepositoryImpl implements LocationRepository {

	private String[] locations = new String[TOTAL_NAMES];
	private int position = 0;

	@Override
	public void surfaceArea(String location) {
		if (this.position < TOTAL_NAMES) {
			this.locations[position] = location;
			System.out.println("location name is :" + location + " at position " + this.position);
			this.position++;
		}
	}
@Override
public boolean isExist(String location) {
for(int index=0; index<=position; index++) {
	String temp=this.locations[index];
	if (temp != null && temp.equals(location)) {
		System.err.println("juice is already exit plese select another");
		return true;
	}

}
	return false;
}
}
