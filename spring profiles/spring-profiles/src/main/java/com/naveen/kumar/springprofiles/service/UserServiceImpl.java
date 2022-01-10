package com.naveen.kumar.springprofiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.naveen.kumar.springprofiles.daorepo.UserRepository;
import com.naveen.kumar.springprofiles.model.User;
@Service
@Profile(value = {"rootdb","dev","prod"})
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public List<User> getUsers() {
		
		return repo.findAll();
	}

}
