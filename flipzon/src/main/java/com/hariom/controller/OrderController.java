package com.hariom.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hariom.entity.Order;
import com.hariom.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@RequestMapping(value = "/{order_id}", 
					method = RequestMethod.GET)
	public Order getOrderById(@PathVariable("order_id") int id) {
		return orderService.getOrderById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, 
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertOrder(@RequestBody Order order) {
		orderService.insertOrder(order);
	}
	
}
