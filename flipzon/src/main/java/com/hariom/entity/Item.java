package com.hariom.entity;


public class Item {
	int 	itemId;
	String 	itemName;
	int 	itemPrice;
	
	public Item(int id, String name, int price) {
		super();
		this.itemId 	= id;
		this.itemName 	= name;
		this.itemPrice 	= price;
	}
	
	public Item() {
		
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int id) {
		this.itemId = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String name) {
		this.itemName = name;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int price) {
		this.itemPrice = price;
	}
}
