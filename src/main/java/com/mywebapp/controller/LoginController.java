package com.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mywebapp.dao.UserDao;
import com.mywebapp.model.User;

@Controller
public class LoginController {
  
	@RequestMapping(method=RequestMethod.POST, value="/loginUser")
	public ModelAndView loginCheck(@ModelAttribute("user") User user){
		
		UserDao dao=new UserDao();
		ModelAndView model;
		if(dao.isValid(user)){
		    model=new ModelAndView("loginSuccess");
		      return model;
		}
		else{
			model=new ModelAndView("loginError");
		      return model;
		}
	}
}
