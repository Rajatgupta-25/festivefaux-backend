package com.festivefox.temporary;

public class UserLogin {
	private String userEmail;
	private String userPassword;
	public UserLogin(String userEmail, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
