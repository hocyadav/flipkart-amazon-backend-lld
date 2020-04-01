package com.hariom.dao;

import java.util.Collection;

import com.hariom.entity.Item;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */


public interface ItemDao {

	Collection<Item> getAllItems();

	Item getItemById(int id);

	void removeItemById(int id);

	void updateItem(Item item);

	void insertItem(Item item);

}