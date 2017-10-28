package com.backend.DAO;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.backend.model.User;

public class UserDAOImpl implements UserDAO
{
	

	@Autowired
	private SessionFactory sessionFactory;

	
	public UserDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public boolean saveOrUpdate(User user) {
		Session session=sessionFactory.openSession();
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
		
	}

	@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User getUserById(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public void removeUserById(int user_id) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public User get(String email) {
		// TODO Auto-generated method stub
		Criteria c = sessionFactory.getCurrentSession().createCriteria(User.class);
		c.add(Restrictions.eq("email", email));

		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) c.list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		} 
		else
		{
			return null;		
	     }
	}
}
