package com.niit.Dao;
import java.util.List;

import com.niit.model.customer;

public interface CustomerDao {
	
		 
	    public void addcustomer(customer c);
	 
	    public List<customer> getAllcustomer();
	 
	    public void deletecustomer(Integer customer);
	 
	    public customer updatecustomer(customer c);
	 
	    public customer getcustomer(int Id);
	}







