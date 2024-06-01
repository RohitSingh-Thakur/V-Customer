package com.v.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.advice.GlobalExceptionHandler;
import com.v.payloads.CustomerDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/v-api")
@Api(value = "Customer Controller", tags = {"Customer API"})
// tags are used to grouping end points like all the customer class related APIs, Tags are specified at class level
// descriptions are used to give more details about the API, what the will do etc. Descriptions are specified at method level
public class CustomerController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);
	
	@ApiOperation(
			value = "CREATE A NEW CUSTOMER", 
			notes = "Provide customer details to create a new customer", 
			response = CustomerDto.class)

	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "SUCCESSFULLY REGISTRED CUSTOMER DATA..."),
			@ApiResponse(code = 400, message = "INVALID DATA ENTERED/ MAKE SURE DATA YOU ARE FILLING IS IN REQUIRED FORMAT..."),
			@ApiResponse(code = 404, message = "UNABLE TO FIND THE REQUESTED ENDPOINT..."),
			@ApiResponse(code = 500, message = "INTERNAL SERVER ERROR -- SOMETHING WENT WRONG AT SERVER SIDE..."),
			@ApiResponse(code = 503, message = "THE SERVICE IS UNAVAILABLE...")
			})
	@PostMapping(path = "/createCustomer", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<CustomerDto> createCustomer(@Valid @ApiParam(value = "CUSTOMER DETAILS AS BELOW ", required = true) @RequestBody CustomerDto customerDto) {
		LOG.info("Inside Create Customer Class");
		return new ResponseEntity<>(customerDto, HttpStatus.CREATED);
	}
}
