package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hariom.dao.ItemDao;
import com.hariom.entity.Item;
import com.hariom.entity.Quantity;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@Service
public class ItemService {
	
	@Autowired
	@Qualifier("fakeDb")
	private ItemDao itemDaoObj;
	
	@Autowired
	private QuantityService quantityService;
	
	/**
	 * get all items from Db
	 * @return list of Item
	 */
	public Collection<Item> getAllItems(){
        return this.itemDaoObj.getAllItems();
    }
	
	public Item getItemById(int id){
        return this.itemDaoObj.getItemById(id); 
    }
	
	/**
	 * Remove an Item from Db
	 * 1. remove from quantity db
	 * 2. remove from item db
	 * @param id
	 */
	public void removeItemById(int id) {
		
		quantityService.removeQuantity(id);
		
        this.itemDaoObj.removeItemById(id);
    }
	
	/**
	 * update old item
	 * @param item
	 */
	public void updateItem(Item item){
    	this.itemDaoObj.updateItem(item);
    }
	
	/**
	 * add new item
	 * 1. insert into quantity db
	 * 2. insert into item db
	 * @param item
	 */
	public void insertItem(Item item){
		
		Quantity qq = new Quantity(item.getItemId(), 1);//for new item default quantity is 1
		quantityService.insertQuantity(qq);
		
        this.itemDaoObj.insertItem(item);
    }
	
}
