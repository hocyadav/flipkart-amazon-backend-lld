package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hariom.dao.OrderDao;
import com.hariom.entity.Order;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@Service
public class OrderService {
	
	@Autowired
	@Qualifier("fakeDb")
	private OrderDao orderDao;
	
	public Collection<Order> getAllOrders(){
		return orderDao.getAllOrders();
	}
	
	
	public Order getOrderById(int id) {
		return orderDao.getOrderById(id);
	}
	
	//new order
	//1. check for quantity count : if 0 return out of stock and dont add, 
	//else return item with left quatity
	public void insertOrder(Order order) {
		orderDao.insertOrder(order);
	}
}
