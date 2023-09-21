package com.xworkz.engDTO.app.dto;

public class ApplicationDTO {

	private int id;
	private String name;
	private String developedBy;
	private String developedAt;
	private String version;

	public ApplicationDTO() {
		super();
	}

	public ApplicationDTO(int id, String name, String developedBy, String developedAt, String version) {
		this.id = id;
		this.name = name;
		this.developedBy = developedBy;
		this.developedAt = developedAt;
		this.version = version;
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public String getDevelopedAt() {
		return developedAt;
	}

	public void setDevelopedAt(String developedAt) {
		this.developedAt = developedAt;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [id=" + id + ", name=" + name + ", developedBy=" + developedBy + ", developedAt="
				+ developedAt + ", version=" + version + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ApplicationDTO) {
				System.out.println("object is ApplicationDTO");
			}
			ApplicationDTO casted = (ApplicationDTO) obj;
			if (casted.id == 0 && casted.name.equals(obj) && casted.developedBy.equals(obj)
					&& casted.developedAt.equals(obj) && casted.version.equals(obj)) {
				System.out.println("instance is same");
				return true;
			} else {
				System.out.println("instance is not same");
				return false;
			}
		}
		return super.equals(obj);
	}
}
