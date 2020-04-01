package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hariom.dao.ItemDao;
import com.hariom.entity.Item;

@Service
public class ItemService {
	
	@Autowired
	private ItemDao itemDaoObj;
	
	public Collection<Item> getAllItems(){
        return this.itemDaoObj.getAllItems();
    }
	
	public Item getItemById(int id){
        return this.itemDaoObj.getItemById(id); 
    }
	
	public void removeItemById(int id) {
        this.itemDaoObj.removeItemById(id);
    }
	
	
	public void updateItem(Item item){
    	this.itemDaoObj.updateItem(item);
    }
	
	public void insertItem(Item item){
        this.itemDaoObj.insertItem(item);
    }
	
}
