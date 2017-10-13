package com.backend.DAO;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unused")
	@Autowired
	private ProductDAO productDAO;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory; 
		
	}
	@Transactional
	public boolean createProduct(Product product){
	Session session =sessionFactory.openSession();
		session.persist(product);
		org.hibernate.Transaction tx=session.beginTransaction();
		tx.commit();
		return true;
	}
	
@Transactional
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Product WHERE id = "+id).executeUpdate();
		return true;
	}
	
  @Transactional
public boolean updateProduct(Product product) {
	// TODO Auto-generated method stub
		 Session session = sessionFactory.openSession();
		 Object o=session.load(Product.class,new Integer(26));
		 Product s=(Product)o;
		 
		 org.hibernate.Transaction tx = session.beginTransaction(); 
		 s.setPrice(678.9);  // implicitly update method will be called.
		 tx.commit();
		 
		 System.out.println("Object Updated successfully.....!!");
		return true;

}
@Transactional
public boolean getproduct(int id) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	Query q=session.createQuery("from Product p");
	List l=q.getResultList();
	System.out.println("Totaal number of records:"+l.size());
	Iterator it=l.iterator();
	 
	while(it.hasNext())
	 {
		 Object o = (Object)it.next();
		 Product p = (Product)o;
		 System.out.println("Product id : "+p.getId());
		 System.out.println("Product Name : "+p.getName());
		 System.out.println("Product Price : "+p.getPrice());
		 System.out.println("----------------------");
	 } 
	return true;

}


@Override
public boolean getProduct(int id) {
	// TODO Auto-generated method stub
	return false;
}
}																																																														