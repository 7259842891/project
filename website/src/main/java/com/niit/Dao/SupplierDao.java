package com.niit.Dao;

import java.util.List;
import java.util.Locale.Category;

import com.niit.model.category;
import com.niit.model.supplier;

public interface SupplierDao {
	
		 
	    public void addsupplier(supplier s);
	 
	    public List<supplier> getAllsupplier();
	 
	    public void deletesupplier(int supplierId);
	    
	    public supplier updatesupplier(supplier s);
	  
	    public supplier getsupplier(int Id);
	}




