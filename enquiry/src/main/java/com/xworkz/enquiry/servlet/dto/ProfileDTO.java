package com.xworkz.enquiry.servlet.dto;

import java.io.Serializable;

public class ProfileDTO implements Serializable{
	
	private String name;
	private String mobileNo;
	private String email;
	private String dob;
	private String location;
	private String password;
	private String confirm;
	
	public ProfileDTO() {
		System.out.println("default....");
	}

	public ProfileDTO(String name, String mobileNo, String email, String dob, String location, String password,
			String confirm) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.dob = dob;
		this.location = location;
		this.password = password;
		this.confirm = confirm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	@Override
	public String toString() {
		return "ProfileDTO [name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + ", dob=" + dob
				+ ", location=" + location + ", password=" + password + ", confirm=" + confirm + "]";
	}

}
