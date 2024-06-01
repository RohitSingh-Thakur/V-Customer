package com.v.constants;

public class GlobalFieldsConstants {

	public static final String firstNameIsEmpty = "First Name Shoud Not Be Empty";
	public static final String firstNameLenght = "First Name Shoud be Between 2 to 20 charachters Or Invalid Name Entered... Digits and Special Symbol Not Allwed";
	
	public static final String lastNameIsEmpty = "Last Name Shoud Not Be Empty";
	public static final String lastNameLenght = "Last Name Shoud be Between 2 to 20 charachters Or Invalid Name Entered... Digits and Special Symbol Not Allwed";
	
	
	public static final String statusIsEmpty = "Status Shoud Not Be Empty";
	public static final String statusLength = "Status Shoud be Between 2 to 20 charachters || Status Shoud be either [Active] Or [Inactive]";
	public static final String statusContainsDigitOrSymbol = "Digits and Special Symbol Not Allwed";
	
	public static final String emailIdIsEmpty = "Email ID Should Not Be Empty";
	public static final String emailIdLenght = "Please Enter Valid Email ID";
	
	public static final String mobileNumberIsEmpty = "Mobile Number Should Not Be Empty";
	public static final String mobileNumberCheck = "Please Enter Valid Mobile Number -> Start with 7, 8, or 9 & Should contain 10 digitd & Should not contains non-numeric and special characters & ";
	
	public static final String bloodGroupIsEmpty = "Blood Group Should Not Be Empty";
	public static final String bloodGroupInvalid = "Invalid Blood Group Entered. Valid Groups are [A, A+, A-, B, B+, B-, AB, AB+, AB-, O, O+, O-]";
	
	public static final String aadharNumberIsEmpty = "Aadhar Number Should Not Be Empty";
	public static final String aadharNumberCheck = "The ID does not contain alphabetic or special characters."
			+ "The ID consists of three groups of four numbers, with a space separating each group of four."
			+ "The ID does not start with either 0 or 1 e.g => [1111 1111 1111]";
	
	public static final String panNumberIsEmpty = "Pan Number Should Not Be Empty";
	public static final String panNumberInvalid = "Invalid Pan Number... Plese Enter In [AAAAA1111A] = first 5 charachter then 4 digit and 1 charachter";
	
	public static final String dateOfBirthIsEmpty = "Birth Date Should Not Be Empty";
	public static final String dateOfBirthInvalid = "Invalid Birth Date... Only Current or Past Date is allowd || Please Use Follow Format [yyyy-MM-dd]";

	public static final String cityIsEmpty = "City Should Not Be Empty";
	public static final String cityLength = "Invalid Name Entered... City Shoud be Between 2 to 20 charachters Or Should not starts with space || Should Not Contains More than one white space between words || Should not contains Only white space";

	public static final String streetIsEmpty = "Street Should Not Be Empty";
	public static final String streetLength = "Invalid Name Entered... Street Shoud be Between 2 to 100 charachters Or Should not starts with space || Should Not Contains More than one white space between words || Should not contains Only white space";

	public static final String pinCodeIsEmpty = "Pin Code Should Not Be Empty";
	public static final String pinCodeCheck = "Invalid Pin Code Entered... Pin Code Shoud contains 6 digits. Should not starts with space, 0, 1, non-digit character, special symbol";
}
