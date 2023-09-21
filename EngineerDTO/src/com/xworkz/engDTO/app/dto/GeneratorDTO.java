package com.xworkz.engDTO.app.dto;

public class GeneratorDTO {

	private String brand;
	private String fuelType;
	private String powerSource;
	private double weight;
	private int outputWattage;
	private String specialFeature;
	private double height;
	private int frequency;
	private int voltage;
	private int current;

	public GeneratorDTO() {
		super();
	}

	public GeneratorDTO(String brand, String fuelType, String powerSource, double weight, int outputWattage,
			String specialFeature, double height, int frequency, int voltage, int current) {
		super();
		this.brand = brand;
		this.fuelType = fuelType;
		this.powerSource = powerSource;
		this.weight = weight;
		this.outputWattage = outputWattage;
		this.specialFeature = specialFeature;
		this.height = height;
		this.frequency = frequency;
		this.voltage = voltage;
		this.current = current;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getOutputWattage() {
		return outputWattage;
	}

	public void setOutputWattage(int outputWattage) {
		this.outputWattage = outputWattage;
	}

	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	@Override
	public String toString() {
		return "GeneratorDTO [brand=" + brand + ", fuelType=" + fuelType + ", powerSource=" + powerSource + ", weight="
				+ weight + ", outputWattage=" + outputWattage + ", specialFeature=" + specialFeature + ", height="
				+ height + ", frequency=" + frequency + ", voltage=" + voltage + ", current=" + current + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof GeneratorDTO) {
				System.out.println("object is GeneratorDTO");
			}
			GeneratorDTO casted = (GeneratorDTO) obj;
			if (casted.brand.equals(obj) && casted.fuelType.equals(obj) && casted.powerSource.equals(obj)
					&& casted.weight == this.weight && casted.outputWattage == this.outputWattage
					&& casted.specialFeature.equals(obj) && casted.height == this.height
					&& casted.frequency == this.frequency && casted.voltage == this.voltage
					&& casted.current == this.current) {
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
