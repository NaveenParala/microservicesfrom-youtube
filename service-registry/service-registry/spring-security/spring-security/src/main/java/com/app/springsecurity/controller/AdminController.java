package com.app.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springsecurity.model.User;
import com.app.springsecurity.repository.UserRepository;

@RestController
@RequestMapping("/secure/rest")
public class AdminController {
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		String pwd=user.getPassword();
		String encodePwd=passwordEncoder.encode(pwd);
		user.setPassword(encodePwd);
		repository.save(user);
		System.out.println("Admin added the user succesfully");
		return "user added successfully....";
	}
	@GetMapping("/findall")
	public List<User> findAll(){
		return repository.findAll();
	}
}
