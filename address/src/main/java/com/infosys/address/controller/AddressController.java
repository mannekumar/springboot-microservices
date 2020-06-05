package com.infosys.address.controller;

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

import com.infosys.address.domain.AddressDomain;
import com.infosys.address.entity.Address;
import com.infosys.address.service.AddressService;

@RestController
@CrossOrigin
public class AddressController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AddressService addressService;

	// Register a new customer
	@PostMapping(value = "{email}/address/add",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> addAddress(@PathVariable String email,@RequestBody AddressDomain addressDTO) {
		logger.info("add request for address controller {}", addressDTO);
		return addressService.addAddress(email,addressDTO);
	}
	
	
	@PostMapping(value = "{email}/address/{address_id}/modify",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> modifyAddress(@PathVariable String email,@PathVariable Long address_id,@RequestBody AddressDomain addressDTO) {
		logger.info("modify request for address controller {}", addressDTO);
		return addressService.modifyAddress(email,address_id,addressDTO);
	}
	
	
	@GetMapping(value = "{email}/address/{address_id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Address viewAddressid(@PathVariable String email,@PathVariable Long address_id) {
		logger.info("view by id request for address controller {}");
		return addressService.viewAddressid(email,address_id);
	}
	
	@GetMapping(value = "{email}/address",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Address> viewAddress(@PathVariable String email) {
		logger.info("view all address by email request for address controller {}");
		return addressService.viewAddress(email);
	}
	
	@GetMapping(value = "{email}/address/{address_id}/delete")
	public Map<String, String> deleteAddress(@PathVariable String email,@PathVariable Long address_id) {
		logger.info("delete by email,id request for address controller {}");
		return addressService.deleteAddress(email,address_id);
	}
	





}
