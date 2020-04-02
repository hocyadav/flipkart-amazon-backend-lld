package com.hariom.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hariom.entity.Item;
import com.hariom.service.ItemService;

/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemServiceObj;
	
	/**
	 * Get all Item
	 * @return list of Item
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Item> getAllItems(){
		System.out.println("getAllItems called...");
        return this.itemServiceObj.getAllItems();
    }
	
	/**
	 * Get Item by item id
	 * @param id
	 * @return Item
	 */
	@RequestMapping(value = "/{item_id}", 
					method = RequestMethod.GET)
	public Item getItemById(@PathVariable("item_id") int id){
		System.out.println("getItemById called...");
        return this.itemServiceObj.getItemById(id); 
    }
	
	/**
	 * Remove an Item from Db
	 * @param id
	 */
	@RequestMapping(value = "/{item_id}",
					method = RequestMethod.DELETE)
	public void removeItemById(@PathVariable("item_id") int id) {
		System.out.println("removeItemById called...");
        this.itemServiceObj.removeItemById(id);
    }
	
	/**
	 * Update old Item
	 * @param item
	 */
	@RequestMapping(method = RequestMethod.PUT, 
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateItem(@RequestBody Item item){
		System.out.println("updateItem called...");
    	this.itemServiceObj.updateItem(item);
    }
	
	/**
	 * Add new Item
	 * @param item
	 */
    @RequestMapping(method = RequestMethod.POST, 
    				consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertItem(@RequestBody Item item){
    	System.out.println("insertItem called...");
        this.itemServiceObj.insertItem(item);
    }
	
}
