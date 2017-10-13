package com.backend.DAO;


import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.backend.model.User;
public class UserDAOImpl implements UserDAO
{
	

@Autowired
private SessionFactory sessionFactory;

@SuppressWarnings("unused")
@Autowired
private UserDAO userDAO;

public UserDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory; 
}

@Transactional
public boolean createUser(User user) {
	// TODO Auto-generated method stub
	Session session = sessionFactory.openSession();
	session.saveOrUpdate(user);
	org.hibernate.Transaction tx=session.beginTransaction();
	tx.commit();
	return true;
	
}

@Override
public boolean updateUser(com.backend.model.User user) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean deleteUser(int id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean getUser(int id) {
	// TODO Auto-generated method stub
	return false;
}

	
	


}
