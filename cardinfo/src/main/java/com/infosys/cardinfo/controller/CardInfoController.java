package com.infosys.cardinfo.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.cardinfo.domain.CardInfoDomain;
import com.infosys.cardinfo.entity.CardInfo;
import com.infosys.cardinfo.service.CardInfoService;

@RestController
@CrossOrigin
public class CardInfoController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CardInfoService cardInfoService;
	
	@PostMapping(value = "{email}/card/add")
	public Map<String, String> addCard(@PathVariable String email,@RequestBody CardInfoDomain cardDTO) {
		logger.info("add request for cardinfo controller {}", cardDTO);
		return cardInfoService.addCard(email,cardDTO);
	}
	
	@GetMapping(value = "{email}/cards",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CardInfo> viewCards(@PathVariable String email) {
		logger.info("view cards by email id request for card info controller {}",email);
		return cardInfoService.viewCards(email);
	}
	
	@GetMapping(value = "{email}/card/{card_number}/delete")
	public Map<String, String> deleteAddress(@PathVariable String email,@PathVariable Long card_number) {
		logger.info("delete by email,id request for card info controller {}");
		return cardInfoService.deletecard(email,card_number);
	}
	
	

}
