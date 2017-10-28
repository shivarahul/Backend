package com.backend.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.backend.model.Order;

public class OrderDAOImpl implements OrderDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public OrderDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory; 
		
	}
	@SuppressWarnings("deprecation")
	@Transactional
	public boolean OrderDetails() {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Query query =sessionFactory.getCurrentSession().createQuery("insert into Order (orderId , productid , productname ,productprice ,quantity ,status ,subTotal ,userid )"+"select orderId ,productid ,productname ,productprice ,quantity ,status ,subTotal ,userid from Cart");
		 query.executeUpdate();
		
		return true;
		
		
	}
	@Transactional
	public List<Order> getAllOrderDetails() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Order> Orderslist= (List<Order>) sessionFactory.getCurrentSession()
				.createQuery("from Order").list();

		return Orderslist;
	}
	
	
	@Transactional		
	public List getOrderDetailsByUser(int userid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Order where userid="+userid).list();
	}

@SuppressWarnings("unchecked")
@Transactional

	public List<Order> getTotal(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
