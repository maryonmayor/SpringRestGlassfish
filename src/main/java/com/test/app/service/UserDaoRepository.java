package com.test.app.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.app.data.User;
import com.test.app.data.Users;
@Repository
public class UserDaoRepository implements IUserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public User get(User user) {
	return null;
	}

	public Users getAll() {
		Users users = new Users();
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		users.setUsers((List<User>) session.createQuery("from Users").list());
		session.getTransaction().commit();
		return users;
		
	}

	public void add(User user) {
		// TODO Auto-generated method stub

	}

	public void edit(User user) {
		// TODO Auto-generated method stub

	}

	public void delete(User user) {
		// TODO Auto-generated method stub

	}

}
