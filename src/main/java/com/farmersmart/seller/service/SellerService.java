package com.farmersmart.seller.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmersmart.seller.entity.SellerEntity;
import com.farmersmart.seller.entity.SellerRepository;

@Service
public class SellerService {
	private static final Logger logger = LoggerFactory.getLogger(SellerService.class);
	@Autowired
	SellerRepository repository;
	String response;
	public String addSeller(SellerEntity enity) {
		// TODO Auto-generated method stub
		System.out.println(enity.toString());
		logger.info(enity.toString());
		repository.save(enity);
		response = "Seller added successfully";
		logger.info(response);
		return response;
	}

	public String updateSeller(SellerEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		response = "Seller updated successfully";
		logger.info(response);
		return response;
	}

	public List<SellerEntity> getSellerDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Optional<SellerEntity> getSellerDetailsById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public List<SellerEntity> getSellerDetailsByName(String name) {
		// TODO Auto-generated method stub
		return repository.getSellerDetailsByName(name);
	}

	public List<SellerEntity> getSellerDetailsByProduct(String product) {
		// TODO Auto-generated method stub
		return repository.getSellerDetailsByProduct(product);
	}

	public List<SellerEntity> getSellerDetailsByCity(String city) {
		// TODO Auto-generated method stub
		return repository.getSellerDetailsByCity(city);
	}

	public List<SellerEntity> getSellerDetailsByPincode(int pincode) {
		// TODO Auto-generated method stub
		return repository.getSellerDetailsByPincode(pincode);
	}

	public List<SellerEntity> getSellerDetailsByProductAndCity(String product, String city) {
		// TODO Auto-generated method stub
		return repository.getSellerDetailsByProductAndCity(product, city);
	}

	public List<SellerEntity> getSellerDetailsByProductAndPincode(String product, int pincode) {
		// TODO Auto-generated method stub
		return repository.getSellerDetailsByProductAndPincode(product, pincode);
	}

	public String deleteSellerById(int id) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(id);
			response = "Seller deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid ID: "+id;
			logger.info(response);
		}
		return response;
	}

	public String deleteSellerByProduct(String product) {
		// TODO Auto-generated method stub
		try {
			repository.deleteSellerByProduct(product);
			response = "Seller deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid product: "+product;
			logger.info(response);
		}
		return response;
	}

	public String deleteSellerByCity(String city) {
		// TODO Auto-generated method stub
		try {
			repository.deleteSellerByCity(city);
			response = "Seller deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid city: "+city;
			logger.info(response);
		}
		return response;
	}

	public String deleteSellerByPincode(int pincode) {
		// TODO Auto-generated method stub
		try {
			repository.deleteSellerByPincode(pincode);
			response = "Seller deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid pincode: "+pincode;
			logger.info(response);
		}
		return response;
	}

	public String deleteSellerByProductAndCity(String product, String city) {
		// TODO Auto-generated method stub
		try {
			repository.deleteSellerByProductAndCity(product, city);
			response = "Seller deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid product & city: "+product+" & "+ city;
			logger.info(response);
		}
		return response;
	}

	public String deleteSellerByProductAndPincode(String product, int pincode) {
		// TODO Auto-generated method stub
		try {
			repository.deleteSellerByProductAndPincode(product, product);
			response = "Seller deleted successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid product & product: "+product+" & "+ product;
			logger.info(response);
		}
		return response;
	}
	
	
}
