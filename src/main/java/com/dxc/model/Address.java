package com.dxc.model;

public class Address {
	int door_no;
	String state;
	String city;
	String country;
	public int getDoor_no() {
		return door_no;
	}
	public void setDoor_no(int door_no) {
		this.door_no = door_no;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(int door_no, String state, String city, String country) {
		super();
		this.door_no = door_no;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [door_no=" + door_no + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	

}
