package com.hariom.dao.DataBaseImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.hariom.dao.QuantityDao;
import com.hariom.entity.Quantity;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@Repository
@Qualifier("fakeDb")
public class QuantityDaoImpl_FakeDb implements QuantityDao {
	private static Map<Integer, Quantity> quantity;
	
	static {									//dummy data
		quantity = new HashMap<Integer, Quantity>(){
			{
				put(1, new Quantity(1, 12));
				put(2, new Quantity(2, 4));
				put(3, new Quantity(3, 6));
				put(4, new Quantity(4, 8));
			}
		};
	}
	
	public Collection<Quantity> getAllQuantity(){
        return quantity.values();
    }
	
	
	public Quantity getQuantityById(int id){
        return quantity.get(id); 
    }
	
	//update old data
	public void updateQuantity(Quantity quan) {
		Quantity qq = quantity.get(quan.getItemId());
		
		qq.setTotalQuantity(qq.getTotalQuantity() + quan.getTotalQuantity());//old quantity + new quantity
		quantity.put(quan.getItemId(), qq);
	}
	
	//add new data
	public void insertQuantity(Quantity quan) {
		quantity.put(quan.getItemId(), quan);
	}
	
	//remove data
	public void removeQuantityById(int id) {
        quantity.remove(id);
    }
	
}
