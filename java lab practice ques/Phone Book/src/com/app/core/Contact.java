package com.app.core;

import java.time.LocalDate;

public class Contact {
	
	private String phoneNumber;
	private String name;
	private LocalDate birthDate;
	private String email;
	
	public Contact(String phoneNumber, String name, LocalDate birthDate, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
	}

	//to make primary key...
	public Contact(String phoneNo) {
		this.phoneNumber = phoneNo;
	}

	public Contact(String name2, String dob) {
		this.name = name2;
		this.birthDate = LocalDate.parse(dob);
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", birthDate=" + birthDate + ", email="
				+ email + "]";
	}

	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Contact) {
			Contact c = (Contact)o;
			return this.phoneNumber.equals(c.phoneNumber);
		}
		return false;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
