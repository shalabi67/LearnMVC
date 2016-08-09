package com.learn.mvc.product;

import java.math.BigDecimal;

public class Product {
	private Integer id;
	private BigDecimal price;
	private String description;
	private String imageUrl;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	public static Product createProduct(Integer id, String description, String price, String imageUrl) {
		Product product = new Product();
		product.setId(id);
		product.setPrice(new BigDecimal(price));
		product.setImageUrl(imageUrl);
		product.setDescription(description);;
		
		return product;
		
	}
}
