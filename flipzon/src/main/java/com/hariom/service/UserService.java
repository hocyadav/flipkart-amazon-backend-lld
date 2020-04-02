package com.hariom.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hariom.dao.UserDao;
import com.hariom.entity.Order;
import com.hariom.entity.User;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@Service
public class UserService {
	
	@Autowired
	@Qualifier("fakeDb")
	private UserDao userDao;
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * Get all User
	 * @return list of User
	 */
	public Collection<User> getAllUser(){
        return userDao.getAllUser();
    }
	
	/**
	 * get user by user id
	 * @param id
	 * @return User
	 */
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	/**
	 * Update old User
	 * @param user
	 */
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	/**
	 * add new user
	 * @param user
	 */
	public void insertUser(User user) {
		userDao.insertUser(user);
	}
	
	/**
	 * get a given user get all orders
	 * 1. list1: get all order
	 * 2. search user id and save in list2
	 * @param searchUserid
	 * @return
	 */
	public Collection<Order> getAllUserOrders(int searchUserid){
		Collection<Order> ordersList1 = orderService.getAllOrders();//this is list obj not map obj
		
		Collection<Order> ordersList2 = new ArrayList<Order>();//list obj
		
		Iterator<Order> it = ordersList1.iterator();
		while(it.hasNext()) {
			Order o = it.next();
			if(o.getUserId() == searchUserid) {
				ordersList2.add(o);
			}
		}
		return ordersList2;
	}
	
}
