package com.infosys.customer.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.customer.domain.CustomerDomain;
import com.infosys.customer.domain.LoginDomain;
import com.infosys.customer.entity.Customer;

import com.infosys.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CustomerRepository custRepo;
	
	public Map<String,String> viewDetails(String Email) {
		logger.info("View request for customer {}");
		Optional<Customer> optCust = custRepo.findById(Email);
		HashMap<String, String> map = new HashMap<>();
		map.put("email",Email);
		map.put("account_type",optCust.get().getAccount_type());
		map.put("name", optCust.get().getName());
		return map;
		}
	

	
	
	//register
	public Map<String,String> createCustomer(CustomerDomain custDTO) {
		logger.info("Creation request for customer {}", custDTO);
		Optional<Customer> optCust = custRepo.findById(custDTO.getEmail());
		if (optCust.isPresent()) {
			HashMap<String, String> map = new HashMap<>();
			map.put("message", "user with given email is already existing");
			return map;
		}
		else {
		Customer cust = custDTO.createEntity();
		custRepo.save(cust);
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "user registered successfully");
		return map;
		}
	}

	// Login
	
	public boolean login(LoginDomain loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		Optional<Customer> optCust = custRepo.findById(loginDTO.getEmail());
		if (optCust.isPresent()) {
			Customer cust = optCust.get();
			if (cust.getPassword().equals(loginDTO.getPassword())) {
				return true;
			}
		}

		return false;
	}

	// Fetches full profile of a specific customer
	
//	public CustomerDTO getCustomerProfile( Long phoneNo) {
//		CustomerDTO custDTO = null;
//		logger.info("Profile request for customer {}", phoneNo);
//		Optional<Customer> optCust = custRepo.findById(phoneNo);
//		if (optCust.isPresent()) {
//			Customer cust = optCust.get();
//			custDTO = CustomerDTO.valueOf(cust);
//		}
//		logger.info("Profile for customer : {}", custDTO);
//		return custDTO;
//	}


}
