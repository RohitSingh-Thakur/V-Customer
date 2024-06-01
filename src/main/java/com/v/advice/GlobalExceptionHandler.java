package com.v.advice;

import java.util.HashMap; 
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handlemethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
		
		LOG.info("Inside MethodArgumentNotValidException Class");
		
		Map<String, String> response = new HashMap<>();
		
		methodArgumentNotValidException.getBindingResult().getAllErrors().forEach(error ->{
			String fieldName = ((FieldError)error).getField();
			String errorMessage = error.getDefaultMessage();
			LOG.error(fieldName + " " + errorMessage );
			response.put(fieldName, errorMessage);
		});		
		

		return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
	}


}
