package com.example.ApplicationTest.pojo;

import javax.persistence.Entity;

@Entity
public class User {
	
	@javax.persistence.Id
	public Long Id;
	
	public String firstName;
	
	public String lastName;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

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

	@Override
	public String toString() {
		return "User [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
