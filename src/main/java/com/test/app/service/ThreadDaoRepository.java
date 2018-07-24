package com.test.app.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.app.data.ThreadSetting;

@Repository
public class ThreadDaoRepository implements IThreadDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public ThreadSetting getSetting() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(ThreadSetting.class);
		criteria.add(Restrictions.eq("id", 1));
		@SuppressWarnings("unchecked")
		List<ThreadSetting> settings =  criteria.list();
		session.getTransaction().commit();
		session.close();
		return settings.get(0);
	}
}
