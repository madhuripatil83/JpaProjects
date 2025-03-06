package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
	
	//Native Query
    @Query(value ="select * from orders where order_desc= :name",nativeQuery = true)
	public Orders getOrderByDesc(String name);
    
    
    @Query("select o.orderDesc from Orders o where o.orderName=:name")
    public List<String> getOrderByName(String name);
    
    @Query("select max(o.orderPrice) from Orders o where o.orderName=:name")
    public Double getPriceOrder(String name);
    
}
