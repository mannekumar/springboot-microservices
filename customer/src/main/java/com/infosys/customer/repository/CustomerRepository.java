package com.infosys.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
