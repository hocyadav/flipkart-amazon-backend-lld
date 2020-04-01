package com.hariom.dao;

import java.util.Collection;

import com.hariom.entity.Quantity;

public interface QuantityDao {

	Collection<Quantity> getAllQuantity();

	Quantity getQuantityById(int id);

	//update old data
	void updateQuantity(Quantity quan);

	//add new data
	void insertQuantity(Quantity quan);

	//remove data
	void removeQuantityById(int id);

}