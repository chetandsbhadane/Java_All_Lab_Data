package com.app.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Contact;
import com.app.utils.ContactFunctions;
import com.app.utils.Validations;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			List<Contact> cList = new ArrayList<>();
			int ch=0;
			do {
				System.out.println("\n1.Add Contact\n2.DisplayAll Details\n0.exit");
				ch = sc.nextInt();
				try {
				switch(ch) {
				case 1:
					System.out.println("enter - Phone No, Name, DOB, Email");
					Contact contact = Validations.validAllInputs(cList,sc.next(), sc.next(), sc.next(), sc.next());
					cList.add(contact);
					break;
					
				case 2:
					for(Contact c:cList) {
						System.out.println(c);
					}
					break;
					
				case 3:
					//update phone number and email..
					System.out.println("enter name,dob, new phoneNo");
					ContactFunctions.updateDetails(cList, sc.next(), sc.next(),sc.next());
//					ContactFunctions.updateDetails(cList,sc.next(),sc.next());
					System.out.println("updated..");
					break;
					
				case 4:
					//remove all contacts above 80 years..
					ContactFunctions.removeDetails(cList);
					break;
				}
				
				}catch(Exception e) {
					e.printStackTrace();
				}
			}while(ch!=0);
		}

	}

}
