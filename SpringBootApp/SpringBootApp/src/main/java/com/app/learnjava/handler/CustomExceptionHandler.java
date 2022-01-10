package com.app.learnjava.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.learnjava.exception.StudentNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> customExceptionHandler(StudentNotFoundException snef){
				
		return new ResponseEntity<String>(snef.getMessage(), HttpStatus.NOT_FOUND);
	}

}
