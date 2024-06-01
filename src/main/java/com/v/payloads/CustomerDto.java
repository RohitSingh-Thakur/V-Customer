package com.v.payloads;

import java.time.LocalDate; 

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

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
	
	@NotBlank(message = "{app.FieldsConstants.firstNameIsEmpty}")
	@Length(min = 2, max = 20, message = "{app.FieldsConstants.firstNameLenght}")
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = "{app.FieldsConstants.firstNameLenght}")
	@ApiModelProperty(notes = "Enter First Name Of Customer", example = "JOHN", required = true, position = 0)
	private String firstName;
	
	@NotBlank(message = "{app.FieldsConstants.lastNameIsEmpty}")
	@Length(min = 2, max = 20, message = "{app.FieldsConstants.lastNameLenght}")
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = "{app.FieldsConstants.lastNameLenght}")
	@ApiModelProperty(notes = "Enter Last Name Of Customer", example = "WICK", required = true, position = 0)
	private String lastName;

	@NotBlank(message = "{app.FieldsConstants.statusIsEmpty}")
	@Length(min = 6, max = 8, message = "{app.FieldsConstants.statusLength}")
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = "{app.FieldsConstants.statusContainsDigitOrSymbol}")
	@ApiModelProperty(notes = "Enter Status Of Customer", example = "Active or Inactive", required = true, position = 0)
	private String status; // pending to implement Active / Inactive

	@Email(message = "{app.FieldsConstants.emailIdLenght}", regexp = GlobalRegex.emailRegex)
	@NotBlank(message = "{app.FieldsConstants.emailIdIsEmpty}")
	@ApiModelProperty(notes = "Enter Customer Email Id", example = "JOHNWICK123@Gmail.com", required = true, position = 0)
	private String emailId;
	
	@Pattern(regexp = GlobalRegex.mobileNumberCheck, message = "{app.FieldsConstants.mobileNumberCheck}")
	@NotBlank(message = "{app.FieldsConstants.mobileNumberIsEmpty}")
	@ApiModelProperty(notes = "Enter Customer Mobile Number", example = "9122334455", required = true, position = 0)
	private String mobileNumber;

	@NotBlank(message = "{app.FieldsConstants.bloodGroupIsEmpty}")
	@Pattern(regexp = GlobalRegex.BloodGroup, message = "{app.FieldsConstants.bloodGroupInvalid}")
	@ApiModelProperty(notes = "Enter Customer Blood Group", example = "A+|A-|B+|B-|AB+|AB-|O+|O-", required = true, position = 0)
	private String bloodGroup;

	@NotNull(message = "{app.FieldsConstants.aadharNumberIsEmpty}")
	@Pattern(regexp = GlobalRegex.aadharCheck, message = "{app.FieldsConstants.aadharNumberCheck}")
	@ApiModelProperty(notes = "Enter Customer Aadhaar card Number", example = "Pair Of 3 Of 4 Digit Numbers", required = true, position = 0)
	private String aadharNumber;

	@NotBlank(message = "{app.FieldsConstants.panNumberIsEmpty}")
	@Pattern(regexp = GlobalRegex.panNumberCheck, message = "{app.FieldsConstants.panNumberInvalid}")
	@ApiModelProperty(notes = "Enter Customer PAN Number", example = "BQRPT12348V", required = true, position = 0)
	private String panNumber;

	@NotNull(message = "{app.FieldsConstants.dateOfBirthIsEmpty}")
	@PastOrPresent(message = "{app.FieldsConstants.dateOfBirthInvalid}")
	@ApiModelProperty(notes = "Enter Customer Date Of Birth", example = "yyyy-MM-dd", required = true, position = 0)
	private LocalDate dateOfBirth; // allowed format is "1989-08-08"

	// no validation required, data filled in service layer 
	@ApiModelProperty(hidden = true)
	private String age;
	
	
	@NotBlank(message = "{app.FieldsConstants.cityIsEmpty}")
	@Pattern(regexp = GlobalRegex.textCheck, message = "{app.FieldsConstants.cityLength}")
	@Length(min = 2, max = 20, message = "{app.FieldsConstants.cityLength}")
	@ApiModelProperty(notes = "Enter Customerm City Name", example = "Akola", required = true, position = 0)
	private String city;
	
	@NotBlank(message = "{app.FieldsConstants.streetIsEmpty}")
	@Pattern(regexp = GlobalRegex.textCheck, message = "{app.FieldsConstants.streetLength}")
	@Length(min = 2, max = 100, message = "{app.FieldsConstants.streetLength}")
	@ApiModelProperty(notes = "Enter Customer Street", example = "ABC", required = true, position = 0)
	private String street;
	
	@NotBlank(message = "{app.FieldsConstants.pinCodeIsEmpty}")
	@Pattern(regexp = GlobalRegex.pinCodeCheck, message = "{app.FieldsConstants.pinCodeCheck}")
	@ApiModelProperty(notes = "Enter Customer Pin code", example = "Six Digit", required = true, position = 0)
	private String pincode;
	
	// no validation required, data filled in service layer 
	@ApiModelProperty(hidden = true)
	private LocalDate registerDate;

	
}
