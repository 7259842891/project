package com.niit.Dao;
import java.util.List;
import java.util.Locale.Category;

import com.niit.model.category;

public interface CategoryDao {
	
		 
	    public void addcategory(category e);
	 
	    public List<category> getAllcategory();
	 
	    public void deletecategory(int categoryId);
	 
	   public Category updatecategory(category category);
	 
	    public category getcategory(int Id);
	}


