package com.xworkz.collectoin.stream.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

public class GameDTO implements Serializable,Comparable<GameDTO>{

	private Integer id; 
	private String name;
	private Integer participants;
	private Integer point;
	private LocalDate eventDate;
	private String winner;
	private String runnerUp;
	private LocalTime duration;
	
	public GameDTO() {
	}

	public GameDTO(int id, String name, int participants, int point, LocalDate eventDate, String winner,
			String runnerUp, LocalTime duration) {
		super();
		this.id = id;
		this.name = name;
		this.participants = participants;
		this.point = point;
		this.eventDate = eventDate;
		this.winner = winner;
		this.runnerUp = runnerUp;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getRunnerUp() {
		return runnerUp;
	}

	public void setRunnerUp(String runnerUp) {
		this.runnerUp = runnerUp;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", name=" + name + ", participants=" + participants + ", point=" + point
				+ ", eventDate=" + eventDate + ", winner=" + winner + ", runnerUp=" + runnerUp + ", duration="
				+ duration + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + participants;
		result = prime * result + point;
		result = prime * result + ((runnerUp == null) ? 0 : runnerUp.hashCode());
		result = prime * result + ((winner == null) ? 0 : winner.hashCode());
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
		GameDTO other = (GameDTO) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (participants != other.participants)
			return false;
		if (point != other.point)
			return false;
		if (runnerUp == null) {
			if (other.runnerUp != null)
				return false;
		} else if (!runnerUp.equals(other.runnerUp))
			return false;
		if (winner == null) {
			if (other.winner != null)
				return false;
		} else if (!winner.equals(other.winner))
			return false;
		return true;
	}

	
	@Override
	public int compareTo(GameDTO argument) {
		return this.id.compareTo(argument.id);
	}
	
	
}
