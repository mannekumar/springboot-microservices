package com.infosys.cardinfo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.cardinfo.domain.CardInfoDomain;
import com.infosys.cardinfo.entity.CardInfo;
import com.infosys.cardinfo.repository.CardInfoRepository;

@Service
public class CardInfoService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CardInfoRepository cardInfoRepo;
	public Map<String, String> addCard(String email,CardInfoDomain cardDTO) {
		logger.info("add request for card service {}", cardDTO);
		CardInfo card = cardDTO.createEntity(email);
		cardInfoRepo.save(card);
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "New Card added successfully");
		return map;
		
	}
	
	
	
	public List<CardInfo> viewCards(String email) {
		logger.info("view all cards  by email request for card info service {}",email);
		List<CardInfo> cardsList= new ArrayList<>();
		List<CardInfo> respcards=cardInfoRepo.getByEmail(email);		
		for (CardInfo  item: respcards) {
			cardsList.add(item);
		}
		return cardsList;
		
	}
	
	public Map<String, String> deletecard(String email,Long card_number) {
		logger.info("delete  card by email,id request for card service {}");
		cardInfoRepo.deleteById(card_number);
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "Card deleted successfully");
		return map;
		
	}


}
