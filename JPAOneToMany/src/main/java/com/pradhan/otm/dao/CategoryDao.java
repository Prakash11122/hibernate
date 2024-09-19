package com.pradhan.otm.dao;

import com.pradhan.otm.entity.CategoryEntity;

public interface CategoryDao {
	
	void saveCategory(CategoryEntity categoryEntity);
	
	CategoryEntity fetchCategory(Integer categoryId);
	
	void removeCategory(Integer categoryId);
	
	

}
