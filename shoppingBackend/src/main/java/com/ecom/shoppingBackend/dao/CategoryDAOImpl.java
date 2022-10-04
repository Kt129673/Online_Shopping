package com.ecom.shoppingBackend.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.ecom.shoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl extends AbstractDao implements CategoryDAO {

	public void saveCategory(Category category) {
		persist(category);
	}

	@SuppressWarnings("unchecked")
	public List<Category> findAllCategory() {
		Criteria criteria = getSession().createCriteria(Category.class);
		return (List<Category>) criteria.list();
	}

	public void updateEmployee(Category category) {
		getSession().update(category);
	}

	public Category findCategoryById(int id) {
		Criteria criteria = getSession().createCriteria(Category.class);
		criteria.add(Restrictions.eq("id", id));
		return (Category) criteria.uniqueResult();
	}

}
