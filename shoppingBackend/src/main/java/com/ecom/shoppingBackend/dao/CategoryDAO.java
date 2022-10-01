package com.ecom.shoppingBackend.dao;

import java.util.List;

import com.ecom.shoppingBackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
