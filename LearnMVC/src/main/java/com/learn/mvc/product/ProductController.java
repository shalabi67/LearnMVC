package com.learn.mvc.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@Autowired
	IProduct productService;
	
	@RequestMapping(value="/products")
	public String getProducts(Model model){
		model = model.addAttribute("products", productService.getProducts());
		return "productsList";
	}

}
