package com.niit.Dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.customer;
import com.niit.model.product;

public class ProductDaoImpl implements ProductDao {
	 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addaproduct(product p) {
        sessionFactory.getCurrentSession().saveOrUpdate( p);
 
    }
 
    
   public void deleteproduct(int productId) {
        product product = (product) sessionFactory.getCurrentSession().load(product.class, productId);
        if (null != product) {
            this.sessionFactory.getCurrentSession().delete(product);
        }
 
    }
 
    public product getProduct(int Id) {
        return (product) sessionFactory.getCurrentSession().get( product.class,Id);
    }
 
  
   
    public List<product> getAllProduct() {
   	 
        return sessionFactory.getCurrentSession().createQuery("from Product").list();
    }

    public product updateProduct(product p) {
        sessionFactory.getCurrentSession().update(p);
        return p;
    }


	public void addproduct(product p) {
		// TODO Auto-generated method stub
		
	}




	public List<product> getAllproduct() {
		// TODO Auto-generated method stub
		return null;
	}




	public product updateproduct(product p) {
		// TODO Auto-generated method stub
		return null;
	}




	public product getproduct(int Id) {
		// TODO Auto-generated method stub
		return null;
	}



}
