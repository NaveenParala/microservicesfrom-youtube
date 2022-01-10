package com.app.learnjava.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.learnjava.exception.StudentNotFoundException;
import com.app.learnjava.model.Student;
import com.app.learnjava.repository.StudentRepo;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		return studentRepo.save(student);
	}

	@GetMapping("/findAll")
	public List<Student> getSTudent() {
		return studentRepo.findAll() ;
	}
	
	@GetMapping("/getOne/{id}")
	public Student getOne(@PathVariable long id) {
		Optional<Student> optional=studentRepo.findById(id);
		Student student=optional.orElseThrow(()->new StudentNotFoundException("STUDENT NOT FOUND"));

		/*
		 * Student student=null; if(optional.isPresent()) student=optional.get();
		 */
		return student;
	} 
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable long id,@RequestBody Student student){
		 
	     Optional<Student> optional=studentRepo.findById(id);
	     Student std=optional.orElseThrow(
	    		 ()-> new StudentNotFoundException("Student Not found")
	    		 );
	     std.setStudent_name(student.getStudent_name());
	     std.setStudent_branch(student.getStudent_branch());
		 return studentRepo.save(std);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable long id){
		
		Optional<Student> opt=studentRepo.findById(id);
		Student std=opt.orElseThrow(()-> new StudentNotFoundException("Enter valid id resource not found for delete ."));
		long sid=std.getStudent_Id();
		studentRepo.delete(std);
		return new ResponseEntity<String>("Record Deleted With The Id '"+sid+"'", HttpStatus.OK) ;
		
	}
	
}
