package com.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	   @RequestMapping(value="/registerUser", method=RequestMethod.GET)
	   public ModelAndView registerUser(){
		   ModelAndView model=new ModelAndView("registerSuccess");
		   return model;
	   }
}
