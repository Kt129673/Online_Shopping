package com.ecom.shoppingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecom.shoppingBackend.dao.CategoryDAO;
import com.ecom.shoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory ;
	
	
	public static List<Category> categories = new ArrayList<Category>();

	static {
		Category category = new Category(101, "Television", "Television Description", "hgfh.jpg", true);
		Category category1 = new Category(102, "Mobile Phone", "Mobiles Description", "hgdfh.jpg", true);
		categories.add(category);
		categories.add(category1);
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	public Category get(int id) {

		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}

		return null;
	}

	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
		
	}

}
