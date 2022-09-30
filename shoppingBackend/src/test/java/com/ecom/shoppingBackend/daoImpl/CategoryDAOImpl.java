package com.ecom.shoppingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.ecom.shoppingBackend.dao.CategoryDAO;
import com.ecom.shoppingBackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	public static List<Category> categories = new ArrayList<Category>();

	static {
		Category category= new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description Television");
		category.setImageurl("cat.png");
		
		categories.add(category);
		Category category1= new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description Television");
		category.setImageurl("cat.png");
		
		categories.add(category1);
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
