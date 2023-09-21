package com.xworkz.engDTO.app.dto;

import java.io.Serializable;

public class EngineerDTO implements Serializable {

	private String id;
	private String name;
	private String collageName;

	public EngineerDTO() {
		super();
	}

	public EngineerDTO(String id, String name, String collageName) {
		this.id = id;
		this.name = name;
		this.collageName = collageName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collageName=" + collageName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof EngineerDTO) {
				System.out.println("object is EngineerDTO");
			}
			EngineerDTO casted = (EngineerDTO) obj;
			if (casted.id.equals(obj) && casted.name.equals(obj) && casted.collageName.equals(obj)) {
				System.out.println("istance is same");
				return true;
			} else {
				System.out.println("istance is not same");
				return false;
			}
		}
		return super.equals(obj);
	}

}
