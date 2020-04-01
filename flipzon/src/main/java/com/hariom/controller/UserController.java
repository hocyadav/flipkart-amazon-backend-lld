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

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<User> getAllUser(){
        return userService.getAllUser();
    }
	
	@RequestMapping(value = "/{user_id}", 
					method = RequestMethod.GET)
	public User getUserById(@PathVariable("user_id") int id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, 
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(method = RequestMethod.POST, 
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertUser(@RequestBody User user) {
		userService.insertUser(user);
	}
	
	@RequestMapping(value = "/{user_id}/order", 
					method = RequestMethod.GET)
	public Collection<Order> getAllUserOrders(@PathVariable("user_id") int id){
		return userService.getAllUserOrders(id);
	}
	
	
}
