package com.onlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecom.shoppingBackend.dao.CategoryDAO;
import com.ecom.shoppingBackend.dto.Category;

@Controller
public class PageController {
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/index", "home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickHome", true);
		mv.addObject("title", "Home");
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}

	@RequestMapping(value = "/aboutUs")
	public ModelAndView aboutUs() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAboutUs", true);
		mv.addObject("title", "About Us");
		return mv;
	}
	
	@RequestMapping(value = "/contactUs")
	public ModelAndView contactUs() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickContactUs", true);
		mv.addObject("title", "Contact Us");
		return mv;
	}
	
//	methods to all product based on category
	
	@RequestMapping(value ="show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAllProducts", true);
		mv.addObject("title", "All Products");
//		Passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value ="show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable ("id") int id) {
		ModelAndView mv = new ModelAndView("page");
//	categoryDAO to fetch single record		
		Category category=categoryDAO.get(id);;
		mv.addObject("userClickCategoryProducts", true);
		mv.addObject("title", category.getName());
//		Passing the single category object
		mv.addObject("cat",category);
		return mv;
	}
			

}
