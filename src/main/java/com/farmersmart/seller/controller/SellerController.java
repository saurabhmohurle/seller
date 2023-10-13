package com.farmersmart.seller.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.seller.entity.SellerEntity;
import com.farmersmart.seller.service.SellerService;

@RestController
public class SellerController {
	private static final Logger logger = LoggerFactory.getLogger(SellerController.class);
	@Autowired
	SellerService service;
	String response;
	
	@PostMapping("/addSeller")
	public String addSeller(@RequestBody SellerEntity enity) {
		service.addSeller(enity);
		response = "Seller added successfully";
		logger.info(response);
		return response;
	}
	@PutMapping("/updateSeller")
	public String updateSeller(@RequestBody SellerEntity entity) {
		service.updateSeller(entity);
		response = "Seller updated successfully";
		logger.info(response);
		return response;
	}
	@GetMapping("/getSellerDetails")
	public List<SellerEntity> getSellerDetails(){
		return service.getSellerDetails();
	}
	@GetMapping("/getSellerDetailsById")
	public Optional<SellerEntity> getSellerDetailsById(@RequestParam int id){
		return service.getSellerDetailsById(id);
	}
	@GetMapping("/getSellerDetailsByName")
	public List<SellerEntity> getSellerDetailsByName(@RequestParam String name){
		return service.getSellerDetailsByName(name);
	}
	@GetMapping("/getSellerDetailsByProduct")
	public List<SellerEntity> getSellerDetailsByProduct(@RequestParam String product){
		return service.getSellerDetailsByProduct(product);
	}
	@GetMapping("/getSellerDetailsByCity")
	public List<SellerEntity> getSellerDetailsByCity(@RequestParam String city){
		return service.getSellerDetailsByCity(city);
	}
	@GetMapping("/getSellerDetailsByPincode")
	public List<SellerEntity> getSellerDetailsByPincode(@RequestParam int pincode){
		return service.getSellerDetailsByPincode(pincode);
	}
	@GetMapping("/getSellerDetailsByProductAndCity")
	public List<SellerEntity> getSellerDetailsByProductAndCity(@RequestParam String product, String city){
		return service.getSellerDetailsByProductAndCity(product, city);
	}
	@GetMapping("/getSellerDetailsByProductAndPincode")
	public List<SellerEntity> getSellerDetailsByProductAndPincode(@RequestParam String product, int pincode){
		return service.getSellerDetailsByProductAndPincode(product, pincode);
	}
	@DeleteMapping("/deleteSellerById")
	public String deleteSellerById(@RequestParam int id) {
		service.deleteSellerById(id);
		response = "Seller deleted successfully";
		logger.info(response);
		return response;
	}
	@DeleteMapping("/deleteSellerByProduct")
	public String deleteSellerByProduct(@RequestParam String product) {
		service.deleteSellerByProduct(product);
		response = "Seller deleted successfully";
		logger.info(response);
		return response;
	}
	@DeleteMapping("/deleteSellerByCity")
	public String deleteSellerByCity(@RequestParam String city) {
		service.deleteSellerByCity(city);
		response = "Seller deleted successfully";
		logger.info(response);
		return response;
	}
	@DeleteMapping("/deleteSellerByPincode")
	public String deleteSellerByPincode(@RequestParam int pincode) {
		service.deleteSellerByPincode(pincode);
		response = "Seller deleted successfully";
		logger.info(response);
		return response;
	}
	@DeleteMapping("/deleteSellerByProductAndCity")
	public String deleteSellerByProductAndCity(@RequestParam String product, String city) {
		service.deleteSellerByProductAndCity(product, city);
		response = "Seller deleted successfully";
		logger.info(response);
		return response;
	}
	@DeleteMapping("/deleteSellerByProductAndPincode")
	public String deleteSellerByProductAndPincode(@RequestParam String product, int pincode) {
		service.deleteSellerByProductAndPincode(product, pincode);
		response = "Seller deleted successfully";
		logger.info(response);
		return response;
	}
	
}
