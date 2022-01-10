package com.app.sancus.service.impl;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.sancus.moddel.User;
import com.app.sancus.repository.UserRepository;
import com.app.sancus.service.IUserService;
@Service
public class UserServiceImpl  implements IUserService,UserDetailsService{

	@Autowired
	private UserRepository repo ; //HAS-A
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	@Override
	//save user
	public Integer save(User user) {
	   user.setPasword(
			   pwdEncoder.encode(user.getPasword()));
		return repo.save(user).getId();
	}
 //get user by username
	
	@Override
	public Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
	Optional<User> opt= findByUsername(username);
	 if(opt==null)
		 throw new UsernameNotFoundException("User not Exist" );
		User user=opt.get();
		 
		 return new org.springframework.security.core.userdetails.User(username,
				 user.getPasword(),
				 user.getRoles().stream()
				 .map(role->new SimpleGrantedAuthority(role))
				 .collect(Collectors.toList())
				 );
	}
}
