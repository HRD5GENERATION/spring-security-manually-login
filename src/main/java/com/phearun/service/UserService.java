package com.phearun.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.phearun.model.Role;
import com.phearun.model.User;

@Service
public class UserService {

	public User loginUser(String username, String password){
		//TODO: your business logic here...
		if(username.equalsIgnoreCase("admin") && password.equals("admin")){		
			User user = new User(1, "admin", "admin", Arrays.asList(new Role(1, "ADMIN")), true);
			return user;
		}
		else if(username.equalsIgnoreCase("user") && password.equals("user")){		
			User user = new User(2, "user", "user", Arrays.asList(new Role(2, "USER")), true);
			return user;
		}
		return null;
	}
	
}
