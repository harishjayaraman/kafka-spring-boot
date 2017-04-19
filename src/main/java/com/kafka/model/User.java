package com.kafka.model;

public class User {

	private String firstName;
	private String lastName;
	private int age;
	private String gender;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "{" + "First name : " + this.firstName + ","
				+ "Last name : " +this.lastName +","
				+ "Age :" + this.age + ","
				+ "Gender : " + this.gender + "}";
	}

}
