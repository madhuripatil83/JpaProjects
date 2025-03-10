package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Orders {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long orderId;
	
	String orderName;
	String orderDesc;
	int orderQty;
	double orderPrice;
	
	
	

}
