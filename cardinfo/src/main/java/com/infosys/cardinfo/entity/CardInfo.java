package com.infosys.cardinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="cardinfo")
public class CardInfo {
	@Id
	@Column(name="card_number")
	private Long card_number;
	@Column(name="email")
	String email;
	@Column(name="name")
	private String name;
	@Column(name="month")
	private Integer month;
	@Column(name="year")
	private Integer year;
	public Long getCard_number() {
		return card_number;
	}
	public void setCard_number(Long card_number) {
		this.card_number = card_number;
	}
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
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	

}
