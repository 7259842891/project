package com.niit.model;

import javax.persistence.Entity;

@Entity
public class customer {
	private String name;
	private int number;
	private String email;
	private String password;
	private String address;
private int DOB;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getDOB() {
	return DOB;
}
public void setDOB(int dOB) {
	DOB = dOB;
}
}


}
