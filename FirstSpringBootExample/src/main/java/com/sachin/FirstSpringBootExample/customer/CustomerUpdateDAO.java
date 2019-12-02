package com.sachin.FirstSpringBootExample.customer;

import javax.persistence.Column;

public class CustomerUpdateDAO {
	
	
	private String firstName;
	
	
	private String lastName;
	
	
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerUpdateDAO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
}
