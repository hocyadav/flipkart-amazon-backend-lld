package com.hariom.dao;

import java.util.Collection;

import com.hariom.entity.Item;

public interface ItemDao {

	Collection<Item> getAllItems();

	Item getItemById(int id);

	void removeItemById(int id);

	void updateItem(Item item);

	void insertItemToDb(Item student);

	void insertItem(Item item);

}