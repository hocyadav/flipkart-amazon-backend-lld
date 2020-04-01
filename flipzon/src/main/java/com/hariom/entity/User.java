package com.hariom.entity;

public class User {
	int userId;
	String userName;
	String userEmail;
	
	public User(int userId, String name, String email) {
		super();
		this.userId = userId;
		this.userName = name;
		this.userEmail = email;
	}
	
	public User() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String email) {
		this.userEmail = email;
	}
	
	
}
