package com.hariom.entity;

import java.util.List;

public class Order {
	int orderId;
	int userId;
	List<Quantity> listOfItem;
	String payementMode;
	//int totalPrice;//TODO : create new class and Order + price as single object 
	
	public Order(int orderId, int userId, List<Quantity> listOfItem, String payementMode) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.listOfItem = listOfItem;
		this.payementMode = payementMode;
	}
	public Order() {//default constructor
		super();
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
	public void setPayementMode(String payementMode) {
		this.payementMode = payementMode;
	}

}
