package com.hariom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hariom.dao.UserDao;
import com.hariom.entity.User;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("fakeDb")
	private UserDao userDao;
	
	public Collection<User> getAllUser(){
        return userDao.getAllUser();
    }
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	//update old User
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	//add new user
	public void insertUser(User user) {
		userDao.insertUser(user);
	}
	
}
