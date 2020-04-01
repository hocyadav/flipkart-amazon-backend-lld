package com.hariom.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hariom.entity.User;

@Repository
public class UserDao {
private static Map<Integer, User> users;
	
	static {									//dummy data
		users = new HashMap<Integer, User>(){
			{
				put(1, new User(1, "name1", "email1@ca.cin"));
				put(2, new User(2, "name2", "email2@ca.cin"));
				put(3, new User(3, "name3", "email3@ca.cin"));
				put(4, new User(4, "name4", "email4@ca.cin"));
			}
		};
	}
	
	public Collection<User> getAllUser(){
        return users.values();
    }
	
	public User getUserById(int id) {
		return users.get(id);
	}
	
	//update old data
	public void updateUser(User user) {
		User u = users.get(user.getUserId());
		
		u.setName(user.getName());
		u.setEmail(user.getEmail());
		
		users.put(user.getUserId(), u);
	}
	
}
