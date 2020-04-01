package com.hariom.entity;

public class Quantity {
	int itemId;
	int quantity;
	
	public Quantity(int itemId, int quantity) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
	}
	public Quantity() {	//default constructor 
		
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
