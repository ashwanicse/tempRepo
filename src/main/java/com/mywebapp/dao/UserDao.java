package com.mywebapp.dao;

import com.mywebapp.model.User;

public class UserDao {
    
	public boolean isValid(User user){
		if(user.getName().equals("Ashwani")&&user.getPassword().equals("1234"))
			return true;
		else 
			return false;
	}
	}
