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
	
	public Collection<User> getAllUser(){
        return userDao.getAllUser();
    }
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	//update old User
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	//add new user
	public void insertUser(User user) {
		userDao.insertUser(user);
	}
	
	//get all orders
	//1.map 1: get all order
	//search user id and save in map2
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
