package com.ecom.shoppingBackend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.shoppingBackend.dto.Category;


@Service
public interface CategoryDAO {
	
	public void saveCategory(Category category);

	public List<Category> findAllCategory();

	public void updateEmployee(Category category);
	
	public Category findCategoryById(int id);

}
