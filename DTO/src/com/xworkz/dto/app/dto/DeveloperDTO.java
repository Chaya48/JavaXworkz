package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class DeveloperDTO implements Serializable {

	private String name;
	private int experince;
	private double salary;
	private String workingFor;
	private String destination;
	private boolean defficult;

	public DeveloperDTO() {
		super();
	}

	public DeveloperDTO(String name, int experince, double salary, String workingFor, String destination,
			boolean defficult) {
		super();
		this.name = name;
		this.experince = experince;
		this.salary = salary;
		this.workingFor = workingFor;
		this.destination = destination;
		this.defficult = defficult;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getWorkingFor() {
		return workingFor;
	}

	public void setWorkingFor(String workingFor) {
		this.workingFor = workingFor;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean isDefficult() {
		return defficult;
	}

	public void setDefficult(boolean defficult) {
		this.defficult = defficult;
	}

	@Override
	public String toString() {
		return "DeveloperDTO [name=" + name + ", experince=" + experince + ", salary=" + salary + ", workingFor="
				+ workingFor + ", destination=" + destination + ", defficult=" + defficult + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DeveloperDTO) {
				System.out.println("object is DeveloperDTO");
			}
			DeveloperDTO casted = (DeveloperDTO) obj;
			if (casted.name.equals(obj) && casted.experince == this.experince && casted.destination.equals(obj)
					&& casted.defficult == this.defficult) {
				System.out.println("instance is same");
				return true;
			} else {
				System.err.println("instance is not same");
				return false;
			}
		}
		return super.equals(obj);

	}

}
