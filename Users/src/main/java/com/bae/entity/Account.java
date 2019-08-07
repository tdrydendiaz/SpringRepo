package com.bae.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@Column (length = 30)
private String accountNumber;
@Column (length = 50)
private String firstName;
@Column (length = 50)
private String lastName;
private String prize;


public Account(String accountNumber, String firstName, String lastName, String prize) {
	super();
	this.accountNumber = accountNumber;
	this.firstName = firstName;
	this.lastName = lastName;
	this.prize = prize;
}

public Account () {
	
}


public long getId() {
	return id;
}


public Account(long id, String accountNumber, String firstName, String lastName, String prize) {
	super();
	this.id = id;
	this.accountNumber = accountNumber;
	this.firstName = firstName;
	this.lastName = lastName;
	this.prize = prize;
}


public void setId(int id) {
	this.id = id;
}


public String getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
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


public String getPrize() {
	return prize;
}


public void setPrize(String prize) {
	this.prize = prize;
}



}
