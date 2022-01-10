package com.naveen.kumar.springprofiles.daorepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.kumar.springprofiles.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
