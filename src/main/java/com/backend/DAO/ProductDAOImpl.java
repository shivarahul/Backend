 package com.backend.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public boolean saveProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	@Transactional
	public List<Product> list() {
	
		List<Product>productlist=sessionFactory.getCurrentSession().createQuery("from Product").list();
		return productlist;
	}
	@Transactional
	public Product getProductById(int product_id) {
		String hql = "from" + " Product" + " where id=" + product_id;
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) query.list();

		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}

		return null;
	}


	@Transactional
	public Product removeProducyById(int product_id) {
		Product ProductToDelete = new Product();
		ProductToDelete.setId(product_id);
		sessionFactory.getCurrentSession().delete(ProductToDelete);
		return ProductToDelete;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Transactional

	public List<Product> getProductByCategory(int category_id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String hql = "from" + " Product" + " where id=" +category_id;
				@SuppressWarnings("rawtypes")
				Query query = sessionFactory.getCurrentSession().createQuery(hql);

				
				List<Product> listProduct = (List<Product>) ((ProductDAOImpl) query).list();

				if (listProduct != null && !listProduct.isEmpty()) {
					return (List<Product>) listProduct.get(0);
				}
				return null;
		
	}

@Transactional
	public List<Product> getProductByCategoryID(int category_id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String hql = "from Product where category_id= "+category_id;
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				List<Product> catproducts = (List<Product>) ((ProductDAOImpl) query).list();
				return catproducts;
		
	}

@Transactional
	public List<Product> homeList() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*	String hql="from Product ORDER BY RAND()";
			@SuppressWarnings("rawtypes")
			Query query=sessionFactory.getCurrentSession().createQuery(hql).setMaxResults(6);
			@SuppressWarnings("unchecked")
			List<Product> listProduct = (List<Product>) ((ProductDAOImpl) query).list();
			if (listProduct != null && !listProduct.isEmpty()) {
				return listProduct;
			}
			*/
			return null;
	}

@Transactional
	public Product getItem(int id) {
		// TODO Auto-generated method stub
		
		Product product=sessionFactory.getCurrentSession().get(Product.class, id);
			
			 return product;
		
	}

	
	
}