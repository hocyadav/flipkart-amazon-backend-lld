package com.hariom.dao.DataBaseImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.hariom.dao.ItemDao;
import com.hariom.entity.Item;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@Repository
@Qualifier("fakeDb")
public class ItemDaoImpl_FakeDb implements ItemDao {
	//postgres data base connection
	
	private static Map<Integer, Item> items;
	
	static {									//data from postgres db
		items = new HashMap<Integer, Item>(){
			{
				put(1, new Item(1, "iPhone 7 pro", 75000));
				put(2, new Item(2, "Moto 360 smart watch", 12500));
				put(3, new Item(3, "Bedsheet", 1500));
				put(4, new Item(4, "OnePlus 7 pro", 39999));
			}
		};
	}
	
	public Collection<Item> getAllItems(){
        return items.values();
    }
	
    public Item getItemById(int id){
        return items.get(id); 
    }

    //remove data
    public void removeItemById(int id) {
        items.remove(id);
    }

    //update old data
    public void updateItem(Item item){
    	Item it = items.get(item.getItemId());
    	
    	it.setItemName(item.getItemName());
    	it.setItemPrice(item.getItemPrice());
    	
        items.put(it.getItemId(), it);
    }

    //add new data
    public void insertItem(Item item){
        items.put(item.getItemId(), item);
    }
	
}
