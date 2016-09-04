package com.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value="/aboutUs", method=RequestMethod.GET)
	public ModelAndView aboutUs(){
		return new ModelAndView("aboutUs");
	}
	
	@RequestMapping(value="/contactUs", method=RequestMethod.GET)
	public ModelAndView contactUs(){
		return new ModelAndView("contactUs");
	}
	
	  @RequestMapping(value="/register", method=RequestMethod.GET)
	   public ModelAndView register(){
		   ModelAndView model=new ModelAndView("register");
		   return model;
	   }
	  
	  @RequestMapping(value="/login", method=RequestMethod.GET)
	   public ModelAndView login(){
		   ModelAndView model=new ModelAndView("login");
		   return model;
	   }
}
