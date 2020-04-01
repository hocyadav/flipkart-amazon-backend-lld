package com.hariom.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hariom.entity.Item;

@Repository
public class FakeDbItemDaoImpl implements ItemDao {
	private static Map<Integer, Item> items;
	
	static {									//dummy data
		items = new HashMap<Integer, Item>(){
			{
				put(1, new Item(1, "Item1", 59));
				put(2, new Item(2, "Item1", 119));
				put(3, new Item(3, "Item1", 91));
				put(4, new Item(4, "Item1", 900));
			}
		};
	}
	
	public Collection<Item> getAllItems(){
        return this.items.values();
    }
	
    public Item getItemById(int id){
        return this.items.get(id); 
    }

    public void removeItemById(int id) {
        this.items.remove(id);
    }

    public void updateItem(Item item){
    	Item it = items.get(item.getId());
    	
    	it.setName(item.getName());
    	it.setPrice(item.getPrice());
    	
        items.put(it.getId(), it);
    }

    public void insertItemToDb(Item student) {
        this.items.put(student.getId(), student);
    }
    
    public void insertItem(Item item){
        this.items.put(item.getId(), item);
    }
	
}
