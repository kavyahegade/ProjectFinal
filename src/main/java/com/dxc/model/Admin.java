package com.dxc.model;

import java.util.Date;

public class Admin extends User {
	
private String adminKey;
	
	public Admin() {
		super();
	}

	public Admin( String username, String password, String adminKey) {
		super(username,password);
		this.adminKey= adminKey;
	}

	public String getAdminKey() {
		return adminKey;
	}

	public void setAdminKey(String adminKey) {
		this.adminKey = adminKey;
	}


}
