package com.niit.Dao;
import java.util.List;

import com.niit.model.product;

public interface ProductDao {
	
		 
	    public void addproduct(product p);
	 
	    public List<product> getAllproduct();
	 
	    public void deleteproduct(Integer product);
	 
	    public product updateproduct(product p);
	 
	    public product getproduct(int Id);
	}



