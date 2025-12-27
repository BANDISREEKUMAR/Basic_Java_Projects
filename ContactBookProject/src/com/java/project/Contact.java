package com.java.project;

public class Contact {

	private String name;
	private String phone;
	private String email;

	// Constructor
	public Contact(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	// Getters (Encapsulation)
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
	}
}
