package com.hariom.entity;

import java.util.List;

public class Order {
	int orderId;
	int userId;
	List<Quantity> listOfItem;
	int totalPrice;//TODO : create new class and Order + price as single object : json can handle invalid request
	String payementMode;
	String orderDate;
	String deliveryDate;
	
	public Order(int orderId, 
				int userId, 
				List<Quantity> listOfItem, 
				String payementMode, 
				String orderDate, 
				String deliveryDate,
				int totalprice) {
		
		this.orderId 		= orderId;
		this.userId 		= userId;
		this.listOfItem 	= listOfItem;
		this.payementMode 	= payementMode;
		this.orderDate 		= orderDate;
		this.deliveryDate 	= deliveryDate;
		this.totalPrice 	= totalprice;
		
	}
	public Order() {//default constructor
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<Quantity> getListOfItem() {
		return listOfItem;
	}
	public void setListOfItem(List<Quantity> listOfItem) {
		this.listOfItem = listOfItem;
	}
	public String getPayementMode() {
		return payementMode;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setPayementMode(String payementMode) {
		this.payementMode = payementMode;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	

}
