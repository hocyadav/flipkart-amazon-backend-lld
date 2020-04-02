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
	
	/**
	 * Get All Order from Db
	 * @return list of Order
	 */
	public Collection<Order> getAllOrders(){
		return orderDao.getAllOrders();
	}
	
	/**
	 * Get Order by order id
	 * @param id
	 * @return Order
	 */
	public Order getOrderById(int id) {
		return orderDao.getOrderById(id);
	}
	
	/**
	 * New Order
	 * 1. check for quantity count : if 0 return out of stock and don't add, 
	 * else return item with left quantity
	 * @param order
	 */
	public void insertOrder(Order order) {
		orderDao.insertOrder(order);
	}
}
