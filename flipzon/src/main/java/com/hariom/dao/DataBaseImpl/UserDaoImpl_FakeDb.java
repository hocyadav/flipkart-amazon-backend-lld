package com.hariom.dao.DataBaseImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.hariom.dao.UserDao;
import com.hariom.entity.User;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

@Repository
@Qualifier("fakeDb")
public class UserDaoImpl_FakeDb implements UserDao {
private static Map<Integer, User> users;
	
	static {									//dummy data
		users = new HashMap<Integer, User>(){
			{
				put(1, new User(1, "Hariom Yadav", "Hariom_Yadav@ca.cin"));
				put(2, new User(2, "Sanjay Kumar", "Sanjay_Kumar@ca.cin"));
				put(3, new User(3, "Rajat Raj", "RajatRaj@ca.cin"));
				put(4, new User(4, "Omprakash", "Omprakash@ca.cin"));
				put(5, new User(5, "Chandan Yadav", "Chandan@ca.cin"));
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
		
		u.setUserName(user.getUserName());
		u.setUserEmail(user.getUserEmail());
		
		users.put(user.getUserId(), u);
	}
	
	public void insertUser(User user) {
		users.put(user.getUserId(), user);
	}
	
	//dont impl in service component
	public void removeUserById(int id) {
		users.remove(id);
	}
}
