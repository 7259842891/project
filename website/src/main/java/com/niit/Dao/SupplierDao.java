package com.niit.Dao;

import java.util.List;

import com.niit.model.supplier;

public interface SupplierDao {
	
		 
	    public void addsupplier(supplier s);
	 
	    public List<supplier> getAllsupplier();
	 
	    public void deletesupplier(Integer supplier);
	 
	    public supplier updatecustomer(supplier s);
	 
	    public supplier getcustomer(int Id);
	}




