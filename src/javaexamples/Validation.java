package javaexamples;

import java.util.*;

public class Validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Employee id");
		String eid = sc.next();
		System.out.println("Enter work Location");
		String loc = sc.next();
		System.out.println("Enter phone number");
		String num = sc.next();
		System.out.println("Enter email id");
		String mail = sc.next();
		System.out.println("Enter Permenemt adress");
		String adress = sc.next();

		try {
			validatePhoneNumber(num);
			System.out.println("Phone number is valid: " + num);
		} catch (InvalidPhoneNumberException e) {
			System.out.println(e.getMessage());
		}
	
	
	 try {
         validateEmail(mail);
         System.out.println("Email address is valid: " + mail);
     } catch (InvalidEmailException e) {
         System.out.println(e.getMessage());
     }
 }

	public static void validatePhoneNumber(String num) throws InvalidPhoneNumberException {
		if (!num.matches("\\d{10}")) {
			throw new InvalidPhoneNumberException("Invalid phone number: " + num);
		}

	}
	
	public static void validateEmail(String mail) throws InvalidEmailException {
        if (!mail.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new InvalidEmailException("Invalid email address: " + mail);
        }
    }
}


