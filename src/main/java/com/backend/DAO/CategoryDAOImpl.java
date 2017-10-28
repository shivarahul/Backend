package com.backend.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.backend.model.Category;

public class CategoryDAOImpl implements CategoryDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public boolean saveCategory(Category category) {
		// TODO Auto-generated method stub

		 sessionFactory.getCurrentSession().saveOrUpdate(category);
		
		
		
		 return true;
	}
	@Transactional
	public List<Category> list() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listCategory;
	}
	@Transactional
	public Category getCategoryById(int category_id) {
		// TODO Auto-generated method stub
		
		String hql = "from"+" Category"+" where id=" + category_id;
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		
		return null;
	}



	@Transactional

	public Category removeCategoryById(int category_id) {
		// TODO Auto-generated method stub
		Category CategoryToDelete = new Category();
		CategoryToDelete.setCategory_id(category_id);
		sessionFactory.getCurrentSession().delete(CategoryToDelete);
		return CategoryToDelete;
	}

	}


