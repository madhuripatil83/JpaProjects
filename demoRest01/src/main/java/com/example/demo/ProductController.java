package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/products")
	public List<Products> getProduct() {
		List<Products> products = productService.findAll();
		return products;
	}
	
	
	@GetMapping("/products/{id}")
	public Products getProductById(@PathVariable int id) {
		Products product = productService.findByProductId(id);
		return product;
	}
}
