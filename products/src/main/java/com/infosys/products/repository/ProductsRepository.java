package com.infosys.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.products.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{
	@Query(value="SELECT e FROM Products e WHERE e.pname LIKE %?1%")
	public List<Products> searchByName(String pname);

}
