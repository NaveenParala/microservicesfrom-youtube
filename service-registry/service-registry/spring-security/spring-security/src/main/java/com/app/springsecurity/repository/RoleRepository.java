package com.app.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springsecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
