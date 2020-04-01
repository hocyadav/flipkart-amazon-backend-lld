package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hariom.dao.ItemDao;
import com.hariom.entity.Item;
import com.hariom.entity.Quantity;

@Service
public class ItemService {
	
	@Autowired
	private ItemDao itemDaoObj;
	
	@Autowired
	private QuantityService quantityService;
	
	public Collection<Item> getAllItems(){
        return this.itemDaoObj.getAllItems();
    }
	
	public Item getItemById(int id){
        return this.itemDaoObj.getItemById(id); 
    }
	
	//remove item
	//1. remove from quantity db
	//2. remove from item db
	public void removeItemById(int id) {
		
		quantityService.removeQuantity(id);
		
        this.itemDaoObj.removeItemById(id);
    }
	
	//update old item
	public void updateItem(Item item){
    	this.itemDaoObj.updateItem(item);
    }
	
	//add new item
	//1. insert into quantity db
	//2. insert into item db
	public void insertItem(Item item){
		
		Quantity qq = new Quantity(item.getItemId(), 1);
		quantityService.insertQuantity(qq);
		
        this.itemDaoObj.insertItem(item);
    }
	
}
