package com.infosys.address.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.address.domain.AddressDomain;
import com.infosys.address.entity.Address;

import com.infosys.address.repository.AddressRepository;

@Service
public class AddressService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AddressRepository addressRepo;
	//register
	public Map<String, String> addAddress(String email,AddressDomain addressDTO) {
		logger.info("add request for address service {}", addressDTO);
		Address address = addressDTO.createEntity(email);
		addressRepo.save(address);
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "New Address added successfully");
		return map;
		
	}
	
	
	public Map<String, String> modifyAddress(String email,Long address_id,AddressDomain addressDTO) {
		logger.info("add request for address service {}", addressDTO);
		Address address = addressDTO.createEntity(email);
	   Optional<Address> resaddr =addressRepo.findById(address_id);
	   resaddr.get().setAddress(address.getAddress());
	   resaddr.get().setCity(address.getCity());
	   resaddr.get().setState(address.getState());
	   resaddr.get().setPincode(address.getPincode());
	   resaddr.get().setPhonenumber(address.getPhonenumber());
		addressRepo.save(resaddr.get());
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "Address updated successfully");
		return map;
		
	}
	
	public Address viewAddressid(String email,Long address_id) {
		logger.info("view address by id request for address service {}");
		Address address=addressRepo.findById(address_id).get();
		return address;
		
	}
	
	public List<Address> viewAddress(String email) {
		logger.info("view all address by email request for address service {}");
		List<Address> addressList= new ArrayList<>();
		List<Address> respaddress=addressRepo.getByEmail(email);
		for (Address  item: respaddress) {
			addressList.add(item);
		}
		return addressList;
		
	}
	
	public Map<String, String> deleteAddress(String email,Long address_id) {
		logger.info("delete  address by email,id request for address service {}");
		addressRepo.deleteById(address_id);
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "Address deleted successfully");
		return map;
		
	}



}
