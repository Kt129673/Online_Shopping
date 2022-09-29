package com.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/index", "home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickHome", true);
		mv.addObject("title", "Home");
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
			

}
