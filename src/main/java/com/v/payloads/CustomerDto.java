package com.v.payloads;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.v.constants.GlobalFieldsConstants;
import com.v.constants.GlobalRegex;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Class Representing Customer Fields...")
public class CustomerDto {
	
	@ApiModelProperty(hidden = true)
	private Long patientId;

	@NotBlank(message = GlobalFieldsConstants.firstNameIsEmpty)
	@Length(min = 2, max = 20, message = GlobalFieldsConstants.firstNameLenght)
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = GlobalFieldsConstants.firstNameLenght)
	@ApiModelProperty(notes = "Enter First Name Of Customer", example = "JOHN", required = true, position = 0)
	private String firstName;
	
	@NotBlank(message = GlobalFieldsConstants.lastNameIsEmpty)
	@Length(min = 2, max = 20, message = GlobalFieldsConstants.lastNameLenght)
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = GlobalFieldsConstants.lastNameLenght)
	@ApiModelProperty(notes = "Enter Last Name Of Customer", example = "WICK", required = true, position = 0)
	private String lastName;

	@NotBlank(message = GlobalFieldsConstants.statusIsEmpty)
	@Length(min = 6, max = 8, message = GlobalFieldsConstants.statusLength)
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = GlobalFieldsConstants.statusContainsDigitOrSymbol)
	@ApiModelProperty(notes = "Enter Status Of Customer", example = "Active or Inactive", required = true, position = 0)
	private String status; // pending to implement Active / Inactive

	@Email(message = GlobalFieldsConstants.emailIdLenght, regexp = GlobalRegex.emailRegex)
	@NotBlank(message = GlobalFieldsConstants.emailIdIsEmpty)
	@ApiModelProperty(notes = "Enter Customer Email Id", example = "JOHNWICK123@Gmail.com", required = true, position = 0)
	private String emailId;
	
	@Pattern(regexp = GlobalRegex.mobileNumberCheck, message = GlobalFieldsConstants.mobileNumberCheck)
	@NotBlank(message = GlobalFieldsConstants.mobileNumberIsEmpty)
	@ApiModelProperty(notes = "Enter Customer Mobile Number", example = "9122334455", required = true, position = 0)
	private String mobileNumber;

	@NotBlank(message = GlobalFieldsConstants.bloodGroupIsEmpty)
	@Pattern(regexp = GlobalRegex.BloodGroup, message = GlobalFieldsConstants.bloodGroupInvalid)
	@ApiModelProperty(notes = "Enter Customer Blood Group", example = "A+|A-|B+|B-|AB+|AB-|O+|O-", required = true, position = 0)
	private String bloodGroup;

	@NotNull(message = GlobalFieldsConstants.aadharNumberIsEmpty)
	@Pattern(regexp = GlobalRegex.aadharCheck, message = GlobalFieldsConstants.aadharNumberCheck)
	@ApiModelProperty(notes = "Enter Customer Aadhaar card Number", example = "Pair Of 3 Of 4 Digit Numbers", required = true, position = 0)
	private String aadharNumber;

	@NotBlank(message = GlobalFieldsConstants.panNumberIsEmpty)
	@Pattern(regexp = GlobalRegex.panNumberCheck, message = GlobalFieldsConstants.panNumberInvalid)
	@ApiModelProperty(notes = "Enter Customer PAN Number", example = "BQRPT12348V", required = true, position = 0)
	private String panNumber;

	@NotNull(message = GlobalFieldsConstants.dateOfBirthIsEmpty )
	@PastOrPresent(message = GlobalFieldsConstants.dateOfBirthInvalid)
	@ApiModelProperty(notes = "Enter Customer Date Of Birth", example = "yyyy-MM-dd", required = true, position = 0)
	private LocalDate dateOfBirth; // allowed format is "1989-08-08"

	// no validation required, data filled in service layer 
	@ApiModelProperty(hidden = true)
	private String age;
	
	
	@NotBlank(message = GlobalFieldsConstants.cityIsEmpty)
	@Pattern(regexp = GlobalRegex.textCheck, message = GlobalFieldsConstants.cityLength)
	@Length(min = 2, max = 20, message = GlobalFieldsConstants.cityLength)
	@ApiModelProperty(notes = "Enter Customerm City Name", example = "Akola", required = true, position = 0)
	private String city;
	
	@NotBlank(message = GlobalFieldsConstants.streetIsEmpty)
	@Pattern(regexp = GlobalRegex.textCheck, message = GlobalFieldsConstants.streetLength)
	@Length(min = 2, max = 100, message = GlobalFieldsConstants.streetLength)
	@ApiModelProperty(notes = "Enter Customer Street", example = "ABC", required = true, position = 0)
	private String street;
	
	@NotBlank(message = GlobalFieldsConstants.pinCodeIsEmpty)
	@Pattern(regexp = GlobalRegex.pinCodeCheck, message = GlobalFieldsConstants.pinCodeCheck)
	@ApiModelProperty(notes = "Enter Customer Pin code", example = "Six Digit", required = true, position = 0)
	private String pincode;
	
	// no validation required, data filled in service layer 
	@ApiModelProperty(hidden = true)
	private LocalDate registerDate;

	
}
