package com.ecom.shoppingBackend.service;

import java.util.List;

import com.ecom.shoppingBackend.dto.Category;



public interface CategoryService   {
	
	
	public void saveCategory(Category category);

	public List<Category> findAllCategory();

	public void updateCategory(Category category);
	
	public Category findCategoryById(int id);

}



