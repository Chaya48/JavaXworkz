package com.xworkz.collectoin.app.dto;

public class TheaterDTO implements Comparable<TheaterDTO> {

	private String name;
	private int capacity;
	private String location;
	private boolean running;

	public TheaterDTO() {
	}

	public TheaterDTO(String name, int capacity, String location, boolean running) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.location = location;
		this.running = running;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", capacity=" + capacity + ", location=" + location + ", running=" + running
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (running ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TheaterDTO other = (TheaterDTO) obj;
		if (capacity != other.capacity)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (running != other.running)
			return false;
		return true;
	}

	@Override
	public int compareTo(TheaterDTO argument) {
		TheaterDTO current = this;
		return current.location.compareTo(argument.location);
	}

}
