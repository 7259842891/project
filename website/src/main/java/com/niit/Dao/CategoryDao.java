package com.niit.Dao;
import java.util.List;

import com.niit.model.category;

public interface CategoryDao {
	
		 
	    public void addcategory(category e);
	 
	    public List<category> getAllcategory();
	 
	    public void deletecategory(Integer category);
	 
	    public category updatecategory(category e);
	 
	    public category getEmployee(int Id);
	}


