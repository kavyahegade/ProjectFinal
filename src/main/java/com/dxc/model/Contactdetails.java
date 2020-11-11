package com.dxc.model;

public class Contactdetails {
	
	int mobile_no;

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Contactdetails(int mobile_no) {
		super();
		this.mobile_no = mobile_no;
	}

	public Contactdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contactdetails [mobile_no=" + mobile_no + "]";
	}
	

}
