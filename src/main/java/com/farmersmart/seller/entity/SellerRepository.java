package com.farmersmart.seller.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<SellerEntity, Integer>{

	public List<SellerEntity> getSellerDetailsByName(String name);
	public List<SellerEntity> getSellerDetailsByProduct(String product);
	public List<SellerEntity> getSellerDetailsByCity(String city);
	public List<SellerEntity> getSellerDetailsByPincode(int pincode);
	public List<SellerEntity> getSellerDetailsByProductAndCity(String product, String city);
	public List<SellerEntity> getSellerDetailsByProductAndPincode(String product, int pincode);
	public String deleteSellerByProduct(String product);
	public String deleteSellerByCity(String city);
	public String deleteSellerByPincode(int pincode);
	public String deleteSellerByProductAndCity(String product,String city);
	public String deleteSellerByProductAndPincode(String product, String pincode);
}
