package com.infosys.products.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.products.domain.ProductsDomain;
import com.infosys.products.entity.Products;
import com.infosys.products.service.ProductsService;

@RestController
@CrossOrigin
public class ProductsController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductsService proService;
	@GetMapping(value = "/deals",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsDomain> viewProducts() {
		logger.info("view products request for products controller {}");
		return proService.viewProducts();
	}
	
	@GetMapping(value = "{pid}/details",produces = MediaType.APPLICATION_JSON_VALUE)
	public Products viewProductId(@PathVariable Long pid) {
		logger.info("view products by id request for products controller {}");
		return proService.viewProductId(pid);
	}

	@GetMapping(value = "searchproduct/{pname}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsDomain> searchProduct(@PathVariable String pname) {
		logger.info("search products request for products controller {}");
		return proService.searchProduct(pname);
	}
}
