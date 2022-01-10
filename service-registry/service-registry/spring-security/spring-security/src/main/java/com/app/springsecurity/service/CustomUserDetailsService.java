package com.app.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.springsecurity.model.User;
import com.app.springsecurity.repository.UserRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUserName(username);
		CustomUserDetails customUserDetails=null;
		if(user!=null) {
			customUserDetails=new CustomUserDetails();
			customUserDetails.setUser(user);
		}
		else {
			throw new UsernameNotFoundException("user not found with username "+username);
		}
		return customUserDetails;
	}

}
