package com.niit.Dao;
import java.util.List;
import java.util.Locale.Category;

import com.niit.model.category;
import com.niit.model.product;

public interface ProductDao {
	
		 
	    public void addproduct(product p);
	 
	    public List<product> getAllproduct();
	 
	    public void deleteproduct(int productId);
	 
	    public product updateproduct(product p);
	    
	    public product getproduct(int Id);
	}



