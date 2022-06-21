package com.teamb.Restfulwebservices9;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Customer {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String Country;
	private String zip;
	public Customer(String id, String firstName, String lastName, String street, String city, String state, String country,
			String zip) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state; 
		this.Country = country;
		this.zip = zip;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
		
	}
	public Customer() {
		super();
	}}
