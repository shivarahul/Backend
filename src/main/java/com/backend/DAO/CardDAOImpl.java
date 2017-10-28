package com.backend.DAO;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.backend.model.Card;

public class CardDAOImpl implements CardDAO
{

	@Autowired
	private SessionFactory sessionFactory;
	
	public CardDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory; 
		
	}
	
	@Transactional
	public boolean saveCard(Card card) {

		sessionFactory.getCurrentSession().saveOrUpdate(card);
		
		return true;
	}

}
