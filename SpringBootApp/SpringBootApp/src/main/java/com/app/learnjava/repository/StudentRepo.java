package com.app.learnjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.learnjava.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
