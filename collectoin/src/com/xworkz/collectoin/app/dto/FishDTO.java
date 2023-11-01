package com.xworkz.collectoin.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FishDTO implements Serializable {

	private int id;
	private String name;
	private double price;
	private float length;
	private short  weight;
	private byte age;
	private char size;
	private boolean RearingAtHome;
	private long width;
	private LocalDate birth;
	private LocalDateTime death;

	public FishDTO() {
		System.out.println("defalut");
	}

	public FishDTO(int id, String name, double price, float length, short weight, byte age, char size,
			boolean rearingAtHome, long width, LocalDate birth, LocalDateTime death) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.length = length;
		this.weight = weight;
		this.age = age;
		this.size = size;
		RearingAtHome = rearingAtHome;
		this.width = width;
		this.birth = birth;
		this.death = death;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public short getWeight() {
		return weight;
	}

	public void setWeight(short weight) {
		this.weight = weight;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public boolean isRearingAtHome() {
		return RearingAtHome;
	}

	public void setRearingAtHome(boolean rearingAtHome) {
		RearingAtHome = rearingAtHome;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public LocalDateTime getDeath() {
		return death;
	}

	public void setDeath(LocalDateTime death) {
		this.death = death;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (RearingAtHome ? 1231 : 1237);
		result = prime * result + age;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((death == null) ? 0 : death.hashCode());
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(length);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + size;
		result = prime * result + weight;
		result = prime * result + (int) (width ^ (width >>> 32));
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
		FishDTO other = (FishDTO) obj;
		if (RearingAtHome != other.RearingAtHome)
			return false;
		if (age != other.age)
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (death == null) {
			if (other.death != null)
				return false;
		} else if (!death.equals(other.death))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (size != other.size)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FishDTO [id=" + id + ", name=" + name + ", price=" + price + ", length=" + length + ", weight=" + weight
				+ ", age=" + age + ", size=" + size + ", RearingAtHome=" + RearingAtHome + ", width=" + width
				+ ", birth=" + birth + ", death=" + death + "]";
	}

}