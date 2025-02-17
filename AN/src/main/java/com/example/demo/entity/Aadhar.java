package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aadhar")
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aadharID;
	private String country;
	private String state;
	private String city;
	public Integer getAadharID() {
		return aadharID;
	}
	public void setAadharID(Integer aadharID) {
		this.aadharID = aadharID;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharID=" + aadharID + ", country=" + country + ", state=" + state + ", city=" + city + "]";
	}
	public Aadhar(Integer aadharID, String country, String state, String city) {
		super();
		this.aadharID = aadharID;
		this.country = country;
		this.state = state;
		this.city = city;
	}
	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
