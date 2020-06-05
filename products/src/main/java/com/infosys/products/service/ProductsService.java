package com.infosys.products.service;
import com.infosys.products.domain.ProductsDomain;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.products.entity.Products;
import com.infosys.products.repository.ProductsRepository;

@Service
public class ProductsService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    ProductsRepository productRepo;
	public List<ProductsDomain> viewProducts() {
		logger.info("view all products request for address service {}");
		List<ProductsDomain> productList= new ArrayList<>();
		List<Products> respaddress=productRepo.findAll();
		for (Products  item: respaddress) {
			ProductsDomain proDomain=new ProductsDomain();
			proDomain.setPid(item.getPid());
			proDomain.setPname(item.getPname());
			proDomain.setPrating(item.getPrating());
			proDomain.setPcategory(item.getPcategory());
			proDomain.setPprice(item.getPprice());
			proDomain.setPimage(item.getPimage());
			productList.add(proDomain);
		}
		return productList;
		
	}
	
	public Products viewProductId(Long pid) {
		logger.info("view  product by id  request for address service {}");
		Products respaddress=productRepo.findById(pid).get();
		return respaddress;
		
	}
	
	public List<ProductsDomain> searchProduct(String pname) {
		logger.info("search product  request for address service {}");
		List<ProductsDomain> productList= new ArrayList<>();
		List<Products> respaddress= productRepo.searchByName(pname);
		for (Products  item: respaddress) {
			ProductsDomain proDomain=new ProductsDomain();
			proDomain.setPid(item.getPid());
			proDomain.setPname(item.getPname());
			proDomain.setPrating(item.getPrating());
			proDomain.setPcategory(item.getPcategory());
			proDomain.setPprice(item.getPprice());
			proDomain.setPimage(item.getPimage());
			productList.add(proDomain);
		}
		return productList;
		
	}

}
