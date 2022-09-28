package com.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/index","home"})
	public ModelAndView index() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring web mvc");
		
		return mv;
	}
	

}
