package com.shoppingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecom.shoppingBackend.dao.CategoryDAO;
import com.ecom.shoppingBackend.dto.Category;

public class CategoryTest  {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private static Category category;

	@Before
	public  void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecom.shoppingBackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void testAddCategory() {

		category = new Category(101, "Television", "Television Description", "hgfh.jpg", true);
		assertEquals("Sucessfully added a category inside the table", true, categoryDAO.add(category));

	}

}
