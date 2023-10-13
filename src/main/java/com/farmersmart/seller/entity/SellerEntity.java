package com.farmersmart.seller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sellers")
public class SellerEntity {
	@Id
	private int id;
	private String name;
	private long phone;
	private String product;
	private String city;
	private int pincode;
	public SellerEntity() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param phone
	 * @param product
	 * @param city
	 */
	public SellerEntity(int id, String name, long phone, String product, String city, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.product = product;
		this.city = city;
		this.pincode = pincode;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "SellerEntity [id=" + id + ", name=" + name + ", phone=" + phone + ", product=" + product + ", city="
				+ city + ", pincode=" + pincode + "]";
	}
	
	
	
}
