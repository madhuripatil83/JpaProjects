package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {

	List<Products> findAll();  
	Products findByProductId(int productId);
}
