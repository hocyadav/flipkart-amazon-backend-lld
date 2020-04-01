package com.hariom.dao;

import java.util.Collection;

import com.hariom.entity.User;

public interface UserDao {

	Collection<User> getAllUser();

	User getUserById(int id);

	//update old data
	void updateUser(User user);

	void insertUser(User user);

	//dont impl in service component
	void removeUserById(int id);

}