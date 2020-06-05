package com.infosys.address.domain;

import com.infosys.address.entity.Address;

public class AddressDomain {

	private String address;
	private String city;
	private String state;
	private Long pincode;
	private Long phonenumber;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public Address createEntity(String email) {
		Address addr = new Address();
		addr.setAddress(this.address);
		addr.setCity(this.city);
		addr.setState(this.state);
		addr.setPincode(this.pincode);
		addr.setPhonenumber(this.phonenumber);
		addr.setEmail(email);
		
		return addr;
	}
	
	
		


}
