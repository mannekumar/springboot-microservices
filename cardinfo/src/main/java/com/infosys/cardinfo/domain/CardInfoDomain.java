package com.infosys.cardinfo.domain;

import com.infosys.cardinfo.entity.CardInfo;

public class CardInfoDomain {
	private Long card_number;
	private String name;
	private Integer month;
	private Integer year;
	public Long getCard_number() {
		return card_number;
	}
	public void setCard_number(Long card_number) {
		this.card_number = card_number;
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
	
	public CardInfo createEntity(String email) {
		CardInfo card = new CardInfo();
		card.setCard_number(this.getCard_number());
		card.setEmail(email);
		card.setName(this.getName());
		card.setMonth(this.getMonth());
		card.setYear(this.getYear());
		
		return card;
	}
	
	
	

}
