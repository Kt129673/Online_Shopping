package com.ecom.shoppingBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.shoppingBackend.dao.CategoryDAO;
import com.ecom.shoppingBackend.dto.Category;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDAO dao;

	public void saveCategory(Category category) {
	
		dao.saveCategory(category);
	}

	public List<Category> findAllCategory() {
		
		return dao.findAllCategory();
	}

	public void updateCategory(Category category) {
		
		dao.updateEmployee(category);
		
	}

	public Category findCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	
		
	

}
