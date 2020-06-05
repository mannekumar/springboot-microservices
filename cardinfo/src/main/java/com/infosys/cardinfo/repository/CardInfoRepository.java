package com.infosys.cardinfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.cardinfo.entity.CardInfo;

public interface CardInfoRepository extends JpaRepository<CardInfo, Long>{

	List<CardInfo> getByEmail(String email);
	

}
