package com.niit.Dao;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.category;

@Repository
	public class CategoryDaoImpl implements CategoryDao {
	 
	    @Autowired
	    private SessionFactory sessionFactory;
	 
	    public void addacategory(category e) {
	        sessionFactory.getCurrentSession().saveOrUpdate( e);
	 
	    }
	 
	    
	  
	    
	    public void deletecategory(int categoryId) {
	        Category category = (Category) sessionFactory.getCurrentSession().load(Category.class, categoryId);
	        if (null != category) {
	            this.sessionFactory.getCurrentSession().delete(category);
	        }
	 
	    }
	 
	    public Category getCategory(int Id) {
	        return (Category) sessionFactory.getCurrentSession().get(
	                Category.class,Id);
	    }
	 
	  
	   
	    public List<category> getAllcategory() {
	   	 
	        return sessionFactory.getCurrentSession().createQuery("from Category").list();
	    }
	    public Category updatecategory(Category category) {
	        sessionFactory.getCurrentSession().update(category);
	        return category;
	    }



		public void addcategory(category e) {
			// TODO Auto-generated method stub
			
		}




		public category getcategory(int Id) {
			// TODO Auto-generated method stub
			return null;
		}




		public Category updatecategory(category category) {
			// TODO Auto-generated method stub
			return null;
		}
	 
	}


