package com.hariom.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hariom.entity.Quantity;
import com.hariom.service.QuantityService;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@RestController
@RequestMapping("/quantity")
public class QuantityController {

	@Autowired
	private QuantityService quantityService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Quantity> getAllQuantity(){
        return this.quantityService.getAllQuantity();
    }
	
	@RequestMapping(value = "/{id}", 
					method = RequestMethod.GET)
	public Quantity getQuantityById(@PathVariable("id") int id){
        return this.quantityService.getQuantityById(id); 
    }
	
	//update old Quantity
	@RequestMapping(method = RequestMethod.PUT,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateQuantity(@RequestBody Quantity quan) {
		this.quantityService.updateQuantity(quan);
	}
	
	//api Commented : add new Quantity - we cant add quantity directly(automatic added when new item added into db), 
	
//	@RequestMapping(method = RequestMethod.POST,
//					consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void insertQuantity(@RequestBody Quantity quan) {
//		this.quantityService.insertQuantity(quan);
//	}
	
}
