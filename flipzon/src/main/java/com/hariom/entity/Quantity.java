package com.hariom.entity;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

public class Quantity {
	int itemId;
	int totalQuantity;
	
	public Quantity(int itemId, int quantity) {
		super();
		this.itemId = itemId;
		this.totalQuantity = quantity;
	}
	public Quantity() {	//default constructor 
		
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int quantity) {
		this.totalQuantity = quantity;
	}
	
}
