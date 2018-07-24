package com.test.app.service;

import java.util.List;

import com.test.app.data.User;
import com.test.app.data.Users;

public interface IUserDao {
	
	User get(User user);
	
	Users getAll();
	
	void add(User user);
	
	void edit(User user);
	
	void delete(User user);
	
	List<User> listOfUsers();
	
}
