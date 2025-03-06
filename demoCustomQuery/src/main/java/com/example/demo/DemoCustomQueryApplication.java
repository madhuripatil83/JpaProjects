package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Orders;
import com.example.demo.service.IOrdersService;

@SpringBootApplication
public class DemoCustomQueryApplication implements CommandLineRunner {

	@Autowired
	private IOrdersService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoCustomQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Orders o1 = new Orders();
		o1.setOrderName("Books");
		o1.setOrderDesc("Fictional Books");
		o1.setOrderQty(100);
		o1.setOrderPrice(1344.33);
		
		
		
		Orders o2 = new Orders();
		o2.setOrderName("Books");
		o2.setOrderDesc("Historical Books");
		o2.setOrderQty(120);
		o2.setOrderPrice(1574.50);
		
		orderService.insertOrders(o1);
		orderService.insertOrders(o2);
		
		Orders order = orderService.fetchOrderByDesc("Fictional Books");
		
		System.out.println(order);
		
		List<String> books = orderService.fetchOrderByName("Books");
		
		System.out.println(books);
		
		Double price = orderService.fetchHighestPriceOrder("Books");
		
		System.out.println(price);
		
		
	}

}
