package com.infosys.customer.domain;

public class LoginDomain {

	private String email;
	private String password;
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
	@Override
	public String toString() {
		return "LoginDomain [email=" + email + ", password=" + password + "]";
	}
	
	

	
}