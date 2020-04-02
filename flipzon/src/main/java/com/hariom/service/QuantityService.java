package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hariom.dao.QuantityDao;
import com.hariom.entity.Quantity;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@Service
public class QuantityService {
	
	@Autowired
	@Qualifier("fakeDb")
	private QuantityDao quqQuantityDao;
	
	/**
	 * Get all Quantity
	 * @return list of Quantity
	 */
	public Collection<Quantity> getAllQuantity(){
        return this.quqQuantityDao.getAllQuantity();
    }
	
	/**
	 * Get Quantity by quantity id
	 * @param id
	 * @return Quantity
	 */
	public Quantity getQuantityById(int id){
        return this.quqQuantityDao.getQuantityById(id); 
    }
	
	/**
	 * update old Quantity
	 * @param quan
	 */
	public void updateQuantity(Quantity quan) {
		this.quqQuantityDao.updateQuantity(quan);
	}
	
	/**
	 * add new Quantity
	 * @param quan
	 */
	public void insertQuantity(Quantity quan) {
		this.quqQuantityDao.insertQuantity(quan);
	}
	
	/**
	 * remove quantity : don't Implement in controller component
	 * @param id
	 */
	public void removeQuantity(int id) {
		this.quqQuantityDao.removeQuantityById(id);
	}
	
}
