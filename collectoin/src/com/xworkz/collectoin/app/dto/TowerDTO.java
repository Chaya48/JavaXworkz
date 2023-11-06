package com.xworkz.collectoin.app.dto;

public class TowerDTO implements Comparable<TowerDTO> {

	private String type;
	private int length;
	private double weight;
	private float width;

	public TowerDTO() {
	}

	public TowerDTO(String type, int length, double weight, float width) {
		super();
		this.type = type;
		this.length = length;
		this.weight = weight;
		this.width = width;
	}

	@Override
	public String toString() {
		return "TowerDTO [type=" + type + ", length=" + length + ", weight=" + weight + ", width=" + width + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(width);
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
		TowerDTO other = (TowerDTO) obj;
		if (length != other.length)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
			return false;
		return true;
	}

	@Override
	public int compareTo(TowerDTO argument) {
		TowerDTO current = this;
		if (current.length == argument.length) {
			return 0;
		}
		if (current.length > argument.length) {
			return 48;
		}
		if (current.length < argument.length) {
			return -23;
		}
		throw new IllegalArgumentException("can not compare");
	}

}
