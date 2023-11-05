package com.xworkz.collectoin.app.dto;

public class HotelDTO {

	private int id;
	private String name;
	private String ownerName;
	private String gst;
	private String loccation;

	public HotelDTO() {
		System.out.println("defalut");
	}

	public HotelDTO(int id, String name, String ownerName, String gst, String loccation) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.gst = gst;
		this.loccation = loccation;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getLoccation() {
		return loccation;
	}

	public void setLoccation(String loccation) {
		this.loccation = loccation;
	}

	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", gst=" + gst + ", loccation="
				+ loccation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gst == null) ? 0 : gst.hashCode());
		result = prime * result + id;
		result = prime * result + ((loccation == null) ? 0 : loccation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
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
		HotelDTO other = (HotelDTO) obj;
		if (gst == null) {
			if (other.gst != null)
				return false;
		} else if (!gst.equals(other.gst))
			return false;
		if (id != other.id)
			return false;
		if (loccation == null) {
			if (other.loccation != null)
				return false;
		} else if (!loccation.equals(other.loccation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}

}
