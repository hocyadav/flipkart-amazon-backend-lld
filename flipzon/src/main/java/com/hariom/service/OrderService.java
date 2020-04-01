package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hariom.dao.OrderDao;
import com.hariom.entity.Order;

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
	
	public void insertOrder(Order order) {
		orderDao.insertOrder(order);
	}
}
