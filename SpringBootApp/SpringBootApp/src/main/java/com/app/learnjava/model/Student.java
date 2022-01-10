package com.app.learnjava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Stuedent_Id")
	private long student_Id;
	@Column(name = "student_name")
	private String student_name;
	@Column(name = "student_branch")
	private String student_branch;
	
	public long getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(long student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_branch() {
		return student_branch;
	}
	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}
	
	
	

}
