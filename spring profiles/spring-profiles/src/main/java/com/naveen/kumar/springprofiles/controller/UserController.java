package com.naveen.kumar.springprofiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.kumar.springprofiles.model.User;
import com.naveen.kumar.springprofiles.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/allUsers")
	public List<User> getAllUsers(){
		return service.getUsers();
	}
	
}
