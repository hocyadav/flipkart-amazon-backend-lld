package com.hariom.dao;

import java.util.Collection;

import com.hariom.entity.Order;

public interface OrderDao {

	Collection<Order> getAllOrders();

	Order getOrderById(int id);

	//new order
	//1. add in user-order db
	//2. add in order db
	//3. iterarte over item and decrement item count in quantity db
	void insertOrder(Order order);

	//remove data : future use
	void removeOrderById(int id);

	//update old data
	void updateOrder(Order order);

}