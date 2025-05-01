package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

	Orders findByOrderDesc(String desc);

	int countByOrderStatus(String status);

	List<Orders> findAllByOrderByOrderQtyDesc();

	Orders findByOrderQtyOrOrderPrice(int qty, double price);

	Orders findByOrderDescAndOrderPrice(String desc, double price);
	
	

}
