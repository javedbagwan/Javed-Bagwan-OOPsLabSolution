package com.greatlearning.service;
import com.greatlearning.model.Employee;
import java.util.Random;


public class CredentialService {

	public String generatePassword() {
		// number, capital letter, small letter & special character
		String generatedPassword = "";

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "123456789";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*()";

		String values = smallLetters + capitalLetters + numbers + specialCharacters;
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*()

		Random randomize = new Random();
		char[] password = new char[8];
		int lengthOfValue = values.length();
		for (int i = 0; i < 8; i++) {
			int randomNextInteger = randomize.nextInt(lengthOfValue);
			password[i] = values.charAt(randomNextInteger);
		}
		generatedPassword=password.toString();
		return generatedPassword;
	}

	public String generateEmailAddress(String firstName, String lastName, String departmentName) {

		// firstNamelastName@department.company.com
		
		String generatedEmailAddress = firstName + lastName + "@" + departmentName + ".greatlearning.com";
		return generatedEmailAddress;
	}

	public void showCredentials(Employee employeeObject, String email, String generatedPassword) {
		// Show password

		System.out.println("Dear" + employeeObject.getFirstName() + "your generated credential are as follows");
		System.out.println("Your generated email is " + email);
		System.out.println("Your generated password is " + generatedPassword);
	}

}
