package com.infosys.customer.controller;

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

import com.infosys.customer.domain.CustomerDomain;
import com.infosys.customer.domain.LoginDomain;
import com.infosys.customer.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CustomerService custService;
	@GetMapping(value = "{email}/profile",produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String>  viewProfile(@PathVariable String email) {
		logger.info("view customers by email request for customer controller {}");
		return custService.viewDetails(email);
	}


	// Register a new customer
	@PostMapping(value = "/register",  consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> createCustomer(@RequestBody CustomerDomain custDTO) {
		logger.info("Creation request for customer {}", custDTO);
		return custService.createCustomer(custDTO);
	}

	// Login
	@PostMapping(value = "/login",consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean login(@RequestBody LoginDomain loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		return custService.login(loginDTO);
	}
	



}
