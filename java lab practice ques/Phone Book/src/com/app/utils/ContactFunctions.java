package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Contact;
import com.app.exceptions.invalidPhoneNumberException;

public class ContactFunctions {
	public static Contact findByPhoneNumber(String phoneNo, List<Contact> cList) throws invalidPhoneNumberException {
		Contact c = new Contact(phoneNo);
		int index = cList.indexOf(c);
		if(index == -1) {
			throw new invalidPhoneNumberException("Contact not found!");
		}
		
		return cList.get(index);
	}
	
	public static void updateDetails(List<Contact> cList,String name, String dob,String newNo) throws invalidPhoneNumberException {
		for(Contact c3:cList) {
			if(!(c3.getName().equals(name) && c3.getBirthDate().equals(LocalDate.parse(dob)))) {
				throw new invalidPhoneNumberException("not existed..");
			}
			else {
				Contact c4 = findByPhoneNumber(c3.getPhoneNumber(), cList);
				c4.setPhoneNumber(newNo);
			}
		}
	}
	
	public static void removeDetails(List<Contact> cList) {
		LocalDate eightyYears = LocalDate.now().minusYears(80);
		for(Contact c5:cList) {
			if(c5.getBirthDate().isBefore(eightyYears)) {
				cList.remove(c5);
			}
		}
		
	}
	

}
