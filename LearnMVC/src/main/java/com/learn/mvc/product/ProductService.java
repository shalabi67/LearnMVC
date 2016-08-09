package com.learn.mvc.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProduct {

	private Map<Integer, Product> products;
	@Override
	public List<Product> getProducts() {
		if(products == null) {
			products = create();
		}
		return new ArrayList<Product>(products.values());
	}
	
	private Map<Integer, Product> create() {
		Map<Integer, Product> map = new HashMap<Integer, Product>();
		
		Product product = Product.createProduct(1, "product1", "10.33", "");
		map.put(product.getId(), product);
		
		product = Product.createProduct(2, "product2", "7.88", "");
		map.put(product.getId(), product);
		
		product = Product.createProduct(3, "product3", "18.99", "");
		map.put(product.getId(), product);
		
		product = Product.createProduct(4, "product4", "99.76", "");
		map.put(product.getId(), product);
		
		return map;
	}

}
