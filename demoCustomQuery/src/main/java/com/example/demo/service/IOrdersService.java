package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;



public interface IOrdersService {
	
	public Orders insertOrders(Orders order);
	public Optional<Orders> getOrderById(Long id);
	
	
	public Orders fetchOrderByDesc(String name);
	
	public List<String> fetchOrderByName(String name);
	
	 public Double fetchHighestPriceOrder(String name);

}
