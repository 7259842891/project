package com.niit.Dao;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.product;
import com.niit.model.supplier;


	public class SupplierDaoImpl implements SupplierDao {
		 
	    @Autowired
	    private SessionFactory sessionFactory;
	 
	    public void addasupplier(supplier s) {
	        sessionFactory.getCurrentSession().saveOrUpdate( s);
	 
	    }
	 
	    
	  
	    
	    public void deletesupplier(int supplierId) {
	        supplier supplier = (supplier) sessionFactory.getCurrentSession().load(supplier.class, supplierId);
	        if (null != supplier) {
	            this.sessionFactory.getCurrentSession().delete(supplier);
	        }
	 
	    }
	 
	    public supplier getSupplier(int Id) {
	        return (supplier) sessionFactory.getCurrentSession().get( supplier.class,Id);
	    }
	 
	  
	   
	    public List<supplier> getAllSupplier() {
	   	 
	        return sessionFactory.getCurrentSession().createQuery("from supplier").list();
	    }
	    public supplier updatesupplier(supplier s) {
	        sessionFactory.getCurrentSession().update(s);
	        return s;
	    }



		public void addsupplier(supplier s) {
			// TODO Auto-generated method stub
			
		}




		public List<supplier> getAllsupplier() {
			// TODO Auto-generated method stub
			return null;
		}




		public supplier getsupplier(int Id) {
			// TODO Auto-generated method stub
			return null;
		}



}
