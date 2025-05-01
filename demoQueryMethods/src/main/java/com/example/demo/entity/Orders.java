package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.annotations.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	private String orderDesc;
	private int orderQty;
	private double orderPrice;
	private LocalDate OrderDate;

	private String orderStatus;

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public LocalDate getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}

	public String isOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String orderDesc, int orderQty, double orderPrice,LocalDate orderDate, String orderStatus) {
		super();
		this.orderDesc = orderDesc;
		this.orderQty = orderQty;
		this.orderPrice = orderPrice;
		OrderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDesc=" + orderDesc + ", orderQty=" + orderQty + ", orderPrice="
				+ orderPrice + ", OrderDate=" + OrderDate + ", orderStatus=" + orderStatus + "]";
	}

}
