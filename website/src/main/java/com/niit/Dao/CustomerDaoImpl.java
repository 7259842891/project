package com.niit.Dao;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.category;
import com.niit.model.customer;


	public class CustomerDaoImpl implements CategoryDao {
		 
	    @Autowired
	    private SessionFactory sessionFactory;
	 
	    public void addacategory(customer  c) {
	        sessionFactory.getCurrentSession().saveOrUpdate( c);
	 
	    }
	 
	    
	  
	    
	    public void deletecategory(int customerId) {
	        customer customer = (customer) sessionFactory.getCurrentSession().load(customer.class, customerId);
	        if (null != customer) {
	            this.sessionFactory.getCurrentSession().delete(customer);
	        }
	 
	    }
	 
	    public customer getCustomer(int Id) {
	        return (customer) sessionFactory.getCurrentSession().get( customer.class,Id);
	    }
	 
	  
	   
	    public List<customer> getAllCustomer() {
	   	 
	        return sessionFactory.getCurrentSession().createQuery("from Customer").list();
	  

	    }
	    public customer updatecustomer(customer c) {
	        sessionFactory.getCurrentSession().update(c);
	        return c;
	    }





		




		public void addcustomer(customer c) {
			// TODO Auto-generated method stub
			
		}




		public List<customer> getAllcustomer() {
			// TODO Auto-generated method stub
			return null;
		}




		public void addcategory(category e) {
			// TODO Auto-generated method stub
			
		}




		public List<category> getAllcategory() {
			// TODO Auto-generated method stub
			return null;
		}




		public Category updatecategory(category category) {
			// TODO Auto-generated method stub
			return null;
		}




		public category getcategory(int Id) {
			// TODO Auto-generated method stub
			return null;
		}
	}



		

		






		
