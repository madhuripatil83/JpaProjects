package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Orders;
import com.example.demo.service.OrdersService;

@SpringBootApplication
public class DemoQueryMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoQueryMethodsApplication.class, args);
		OrdersService service = ctx.getBean(OrdersService.class);

//		Orders o1 = new Orders();
//		o1.setOrderDate(LocalDate.of(2025, 4, 21));
//		o1.setOrderDesc("Books");
//		o1.setOrderPrice(2345.12);
//		o1.setOrderQty(100);
//       	o1.setOrderStatus("true");
//       	
//       	Orders o2 = new Orders();
//		o2.setOrderDate(LocalDate.of(2024,3 , 21));
//		o2.setOrderDesc("Fictional Books");
//		o2.setOrderPrice(5000.33);
//		o2.setOrderQty(150);
//       	o2.setOrderStatus("false");
//       	
//		service.saveOrders(o1);
//		service.saveOrders(o2);

//		Orders order = service.findByOrderDesc("Books");
//		System.out.println(order);
//		
//		
//		 int count = service.getCountByStatus("true");
//	        System.out.println("Orders with status 'true': " + count);		
//		
//		System.out.println(service.getOrdersByQtyAsc());

		// System.out.println(service.getOrderByQtyOrPrice(100, 2345.12));

		System.out.println(service.getOrdersByDescAndPrice("Books", 2345.12));
	}

}
