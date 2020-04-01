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
@Qualifier("postgresDb")
public class ItemDaoImpl_PostgresDb implements ItemDao {
	private static Map<Integer, Item> items;
	
	static {									//add some dummy data
		items = new HashMap<Integer, Item>(){
			{
				put(1, new Item(1, "Item1 from postgres db", 59));
				put(2, new Item(2, "Item2 from postgres db", 119));
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
