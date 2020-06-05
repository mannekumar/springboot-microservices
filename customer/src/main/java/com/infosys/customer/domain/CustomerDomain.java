package com.infosys.customer.domain;

import com.infosys.customer.entity.Customer;

public class CustomerDomain {

	private String email;
	private String name;
	private String account_type;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerDomain [email=" + email + ", name=" + name + ", account_type=" + account_type + ", password="
				+ password + "]";
	}
	
	public Customer createEntity() {
		Customer cust = new Customer();
		cust.setEmail(this.getEmail());
		cust.setName(this.getName());
		cust.setPassword(this.getPassword());
		cust.setAccount_type(this.getAccount_type());
		
		return cust;
	}
		


}
