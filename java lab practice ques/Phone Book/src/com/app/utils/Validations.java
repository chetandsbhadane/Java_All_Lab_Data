package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Contact;
import com.app.exceptions.invalidEmailFormatException;
import com.app.exceptions.invalidPhoneNumberException;

public class Validations {

	public static Contact validAllInputs(List<Contact> cList,String phoneNo, String name, String dob, String email) throws invalidEmailFormatException, invalidPhoneNumberException {

		validateEmail(email);

		return new Contact(phoneNo, name, LocalDate.parse(dob), email);
	}

	public static boolean validateEmail(String email) throws invalidEmailFormatException {
		String pattern = "[a-z]+[a-z0-9]+@[a-z]+.[com|org|net]";//[a-z]+[a-z0-9]+@[a-z]+.[com|org|net]
		if(!(email.matches("(.*)"+pattern+"(.*)"))) {
			throw new invalidEmailFormatException("Email should be chetan09@gmail.com");
		}

		return true;
	}
}
