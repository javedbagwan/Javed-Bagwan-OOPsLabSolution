package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class EmailDriver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to greatlearning, Let's create your credentials for you!");
		System.out.println("Please enter your first name:");
		String firstName = scanner.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = scanner.nextLine();

		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");

		int option = scanner.nextInt();
		String departmentName = "";
		switch (option) {
		case 1:
			departmentName = "tech";
			break;
		case 2:
			departmentName = "adm";
			break;
		case 3:
			departmentName = "HR";
			break;
		case 4:
			departmentName = "lg";
			break;
		default:
			System.out.println("Please enter valid option");

		}
		Employee employeeObject = new Employee();
		CredentialService credentialService = new CredentialService();
		String generatedEmail = credentialService.generateEmailAddress(firstName, lastName, departmentName);
		String generatedPassword = credentialService.generatePassword();
		credentialService.showCredentials(employeeObject, generatedEmail, generatedPassword);
	}

}
