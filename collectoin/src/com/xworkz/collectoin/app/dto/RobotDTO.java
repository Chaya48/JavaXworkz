package com.xworkz.collectoin.app.dto;

public class RobotDTO implements Comparable<RobotDTO>{
	
	private String brand;
	private String types;
	private boolean userFriendly;
	private double weight;
	 public RobotDTO() {
}
	public RobotDTO(String brand, String types, boolean userFriendly, double weight) {
		super();
		this.brand = brand;
		this.types = types;
		this.userFriendly = userFriendly;
		this.weight = weight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public boolean isUserFriendly() {
		return userFriendly;
	}
	public void setUserFriendly(boolean userFriendly) {
		this.userFriendly = userFriendly;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "RobotDTO [brand=" + brand + ", types=" + types + ", userFriendly=" + userFriendly + ", weight=" + weight
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((types == null) ? 0 : types.hashCode());
		result = prime * result + (userFriendly ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		RobotDTO other = (RobotDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (types == null) {
			if (other.types != null)
				return false;
		} else if (!types.equals(other.types))
			return false;
		if (userFriendly != other.userFriendly)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	@Override
	public int compareTo(RobotDTO argument) {
		RobotDTO current=this;
		return current.brand.compareTo(argument.brand);
	}

}
