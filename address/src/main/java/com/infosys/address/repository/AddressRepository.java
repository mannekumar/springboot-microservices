package com.infosys.address.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.address.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
	List<Address> getByEmail(String email);

}
