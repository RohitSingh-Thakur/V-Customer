package com.v.entity;

import java.time.LocalDate;  

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false, unique = true)
	private Long patientId;
	
	@Column(name = "firstName", nullable = true, unique = false)
	private String firstName;
	
	@Column(name = "lastName", nullable = true, unique = false)
	private String lastName;

	@Column(name = "status", nullable = true, unique = false)
	private String status;

	@Column(name = "email", nullable = true, unique = false)
	private String emailId;
	
	@Column(name = "mobileNumber", nullable = true, unique = false)
	private String mobileNumber;

	@Column(name = "bloodGroup", nullable = true, unique = false)
	private String bloodGroup;

	@Column(name = "aadharNumber", nullable = true, unique = false)
	private String aadharNumber;

	@Column(name = "panNumber", nullable = true, unique = false)
	private String panNumber;
	
	@Column(name = "dob", nullable = true, unique = false)
	private LocalDate dateOfBirth;

	@Column(name = "age", nullable = true, unique = false)
	private String age;
	
	@Column(name = "city", nullable = true, unique = false)
	private String city;
	
	@Column(name = "street", nullable = true, unique = false)
	private String street;

	@Column(name = "pincode", nullable = true, unique = false)
	private String pincode;

	@Column(name = "registerDate", nullable = true, unique = false)
	private LocalDate registerDate;
}
