package com.dxc.model;

public class Location {
	String loc_name;
	int code;
	String off_name;
	String country;
	public String getLoc_name() {
		return loc_name;
	}
	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getOff_name() {
		return off_name;
	}
	public void setOff_name(String off_name) {
		this.off_name = off_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Location(String loc_name, int code, String off_name, String country) {
		super();
		this.loc_name = loc_name;
		this.code = code;
		this.off_name = off_name;
		this.country = country;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [loc_name=" + loc_name + ", code=" + code + ", off_name=" + off_name + ", country=" + country
				+ "]";
	}
	

}
