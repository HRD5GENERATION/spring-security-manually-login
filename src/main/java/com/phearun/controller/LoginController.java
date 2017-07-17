package com.phearun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phearun.model.User;
import com.phearun.service.UserService;

@Controller
public class LoginController {

	private UserService userService;
	
	@Autowired
	public LoginController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@PostMapping("/process-login")
	public String processLogin(@RequestParam String username, @RequestParam String password){
		User user = userService.loginUser(username, password);
		if(user != null){
			//TODO: Set session to Spring SecurityContext
			Authentication auth = new UsernamePasswordAuthenticationToken(user, null, user.getRoles());
			SecurityContextHolder.getContext().setAuthentication(auth);
			
			System.out.println("=> Login success, Session set!");
			return "index";
		}
		return "login";
	}
	
	
	@GetMapping("/admin")
	public String adminPage(){
		return "admin";
	}
	
	@GetMapping("/user")
	public String userPage(){
		return "user";
	}
}
