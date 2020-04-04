package com.hariom.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hariom.entity.ApiStatus;
import com.hariom.entity.Order;
import com.hariom.service.OrderService;
import com.hariom.util.Status;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	/**
	 * Get all Order
	 * @return list of Order
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	/**
	 * get Order by order id
	 * @param id
	 * @return Order
	 */
	@RequestMapping(value = "/{order_id}", 
					method = RequestMethod.GET)
	public Order getOrderById(@PathVariable("order_id") int id) {
		return orderService.getOrderById(id);
	}
	
	/**
	 * Insert new Order
	 * @param order
	 */
	@RequestMapping(method = RequestMethod.POST, 
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApiStatus> insertOrder(@RequestBody Order order) {
		orderService.insertOrder(order);
		return new ResponseEntity<ApiStatus>(new ApiStatus("insertOrder", Status.SUCCESS), 
											HttpStatus.OK);
	}
	
}
