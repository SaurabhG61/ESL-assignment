package com.auditis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auditis.model.User;
import com.auditis.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showUserLogin() {
		User user =  userService.getUser("sudhir");
		System.out.println(user.getEmailId());
		return "login";
	}
	@RequestMapping(value="/getAllUsers",method=RequestMethod.POST)
	public String showAllUsers(Model model) {
		List<User> userList=userService.getAllUsers();
		model.addAttribute("userList",userList);
		return "showAllUsers";
	}
	
	
	
}
