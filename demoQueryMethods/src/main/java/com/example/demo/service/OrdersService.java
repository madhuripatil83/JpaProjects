package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.repo.OrdersRepository;

@Service
public class OrdersService {
	
	
	@Autowired
	private OrdersRepository repo;
	
	
	
	public void saveOrders(Orders order) {
		repo.save(order);
		
	}
	
	
	public Orders findByOrderDesc(String desc) {
		return repo.findByOrderDesc(desc);
	}
	
	
	public int getCountByStatus(String status) {
		return  repo.countByOrderStatus(status);
	}
	
	
	public  List<Orders> getOrdersByQtyAsc() {
		return repo.findAllByOrderByOrderQtyDesc();
	}

	public Orders getOrderByQtyOrPrice(int qty,double price) {
		return repo.findByOrderQtyOrOrderPrice(qty, price);
	}
	
	public Orders getOrdersByDescAndPrice(String desc,double price) {
	   return repo.findByOrderDescAndOrderPrice(desc, price);
	}
	
	
	
}
