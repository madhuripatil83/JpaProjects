package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.repo.OrdersRepository;

@Service
public class OrdersServiceImpl implements IOrdersService{

	@Autowired
	private OrdersRepository repo;
	
	@Override
	public Orders insertOrders(Orders order) {
		return repo.save(order);
	}

	@Override
	public Optional<Orders> getOrderById(Long id) {
		return repo.findById(id);
	}

	@Override
	public Orders fetchOrderByDesc(String name) {
		// TODO Auto-generated method stub
		return repo.getOrderByDesc(name);
	}

	@Override
	public List<String> fetchOrderByName(String name) {
		// TODO Auto-generated method stub
		return repo.getOrderByName(name);
	}

	@Override
	public Double fetchHighestPriceOrder(String name) {
		// TODO Auto-generated method stub
		return repo.getPriceOrder(name);
	}

	

}
