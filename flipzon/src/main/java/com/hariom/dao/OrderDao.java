package com.hariom.dao;

import java.util.Collection;

import com.hariom.entity.Order;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

public interface OrderDao {

	Collection<Order> getAllOrders();

	Order getOrderById(int id);

	//new order
	void insertOrder(Order order);

	//remove data : future use
	void removeOrderById(int id);

	//update old data
	void updateOrder(Order order);

}