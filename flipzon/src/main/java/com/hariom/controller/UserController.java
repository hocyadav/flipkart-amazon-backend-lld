package com.hariom.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hariom.entity.Order;
import com.hariom.entity.User;
import com.hariom.service.UserService;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * Get all User
	 * @return list of User
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Collection<User> getAllUser(){
        return userService.getAllUser();
    }
	
	/**
	 * Get User by user id
	 * @param id
	 * @return User
	 */
	@RequestMapping(value = "/{user_id}", 
					method = RequestMethod.GET)
	public User getUserById(@PathVariable("user_id") int id) {
		return userService.getUserById(id);
	}
	
	/**
	 * Update old User
	 * @param user
	 */
	@RequestMapping(method = RequestMethod.PUT, 
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	/**
	 * Insert new User
	 * @param user
	 */
	@RequestMapping(method = RequestMethod.POST, 
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertUser(@RequestBody User user) {
		userService.insertUser(user);
	}
	
	/**
	 * Get all Order of a given User
	 * @param id
	 * @return list of Order
	 */
	@RequestMapping(value = "/{user_id}/order", 
					method = RequestMethod.GET)
	public Collection<Order> getAllUserOrders(@PathVariable("user_id") int id){
		return userService.getAllUserOrders(id);
	}
	
	
}
