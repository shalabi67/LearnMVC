package com.learn.mvc.products;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.learn.mvc.product.IProduct;
import com.learn.mvc.product.Product;
import com.learn.mvc.product.ProductController;

public class ProductListControllerTests {

	private MockMvc mockMvc;
	@Mock
	private IProduct productService;
	
	@InjectMocks
	private ProductController productController;
	private List<Product> products = new ArrayList<Product>();
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
		
		Product product = Product.createProduct(1, "product1", "10.33", "");
		products.add(product);
		
	}
	
	@Test
	public void test() {
		when(productService.getProducts()).thenReturn(products);
		try {
			mockMvc.perform(get("/products"))
			.andExpect(status().isOk())
			.andExpect(view().name("productsList"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
	}

}
