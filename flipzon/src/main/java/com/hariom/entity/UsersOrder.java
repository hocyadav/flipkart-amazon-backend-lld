package com.hariom.entity;

import java.util.List;

public class UsersOrder {
	int orderId;
	List<Quantity> listOfItems;
	
	int totalPrice;
	String modeOfPayment;
	
	String orderDate;
	String deliveryDate;
	
	public UsersOrder(int orderId, List<Quantity> listOfItems, int totalPrice, String modeOfPayment, String orderDate,
			String deliveryDate) {
		super();
		this.orderId = orderId;
		this.listOfItems = listOfItems;
		this.totalPrice = totalPrice;
		this.modeOfPayment = modeOfPayment;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
	}
	
	public UsersOrder() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Quantity> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(List<Quantity> listOfItems) {
		this.listOfItems = listOfItems;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
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
/** 
LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
 */
