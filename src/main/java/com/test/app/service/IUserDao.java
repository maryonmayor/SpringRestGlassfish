package com.test.app.service;

import java.util.List;

import com.test.app.data.User;

public interface IUserDao {
	
	User get(User user);
	
	List<User> getAll();
	
	void add(User user);
	
	void edit(User user);
	
	void delete(User user);
	
}
