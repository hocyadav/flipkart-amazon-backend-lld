package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hariom.dao.QuantityDao;
import com.hariom.entity.Quantity;

@Service
public class QuantityService {
	
	@Autowired
	private QuantityDao quqQuantityDao;
	
	public Collection<Quantity> getAllQuantity(){
        return this.quqQuantityDao.getAllQuantity();
    }
	
	public Quantity getQuantityById(int id){
        return this.quqQuantityDao.getQuantityById(id); 
    }
	
	//update old Quantity
	public void updateQuantity(Quantity quan) {
		this.quqQuantityDao.updateQuantity(quan);
	}
	
	//add new Quantity
	public void insertQuantity(Quantity quan) {
		this.quqQuantityDao.insertQuantity(quan);
	}
	
}
