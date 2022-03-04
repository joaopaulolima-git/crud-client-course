package com.jpdev.crudclient.resources.excepiton;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jpdev.crudclient.services.excepitions.ResourceNotFoundExcepition;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundExcepition.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundExcepition e,HttpServletRequest request){
		StandardError err = new StandardError();
		err.setTimestemp(Instant.now());
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.setError("Resource not Found");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);		
	}
}
