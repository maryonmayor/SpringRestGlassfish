package com.test.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.test.app.data.User;
@Repository
public class UserDaoRepository implements IUserDao {
	
	@PersistenceContext
	EntityManager entityManager;
	

	public User get(User user) {
	return null;
	}

	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		Query users = entityManager.createQuery("Select u from Users");
		return (List<User>) users.getResultList();
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
